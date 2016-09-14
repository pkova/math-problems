(ns euler19)

(def months [
             [:january 31]
             [:february 28]
             [:march 31]
             [:april 30]
             [:may 31]
             [:june 30]
             [:july 31]
             [:august 31]
             [:september 30]
             [:october 31]
             [:november 30]
             [:december 31]
             ])



(def weekdays [:tuesday :wednesday :thursday :friday :saturday :sunday :monday])

(defn leapyear? [year]
  (= 0 (mod year 4)))

(defn monthinc [n]
  (if (= n 11)
    0
    (inc n)))

(defn yearinc [n mon]
  (if (= mon 11)
    (inc n)
    n))

(defn walk
  ([] (walk 1901 2001 0 0 0))
  ([start end sum days mon]
  (if (= start end)
    sum
    (let [curr (if (and (leapyear? start) (= mon 1))
                 (+ 1 days ((months mon) 1))
                 (+ days ((months mon) 1)))
          day (weekdays (rem curr 7))]
      (if (= day :sunday)
        (recur (yearinc start mon) end (inc sum) curr (monthinc mon))
        (recur (yearinc start mon) end sum curr (monthinc mon)))))))

(walk)
