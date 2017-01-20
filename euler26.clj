(ns euler26)

(defn stringify [denom]
  (subs (str (with-precision (* 2 denom) (/ 1M denom))) 2))

(defn check-length [s n]
  (let [colls (partition n s)]
    (every? #(= (first colls) %) colls)))

(defn solve [denom]
  (first (filter #(check-length (stringify denom) %) (range 2 denom))))

(def >+ (fnil > false))

(defn choose [memo curr]
  (let [solution (solve curr)]
    (if (and (not (nil? solution)) (>+ solution (second memo)))
      [curr solution]
      memo)))

(reduce choose [0 0] (range 1 1000))
