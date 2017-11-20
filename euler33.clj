(ns euler33)

(defn cancelling? [n d]
  (try
    (and
     (not= 1 (/ n d))
     (= (second (map str (str n))) (first (map str (str d))))
     (= (/ n d) (/ (Integer/parseInt (first (map str (str n))))
                   (Integer/parseInt (second (map str (str d)))))))
    (catch Exception e
      false)))

(denominator (reduce * (for [d (range 10 100)
                             n (range 10 (inc d))
                             :when (cancelling? n d)]
                         (/ n d))))
