(ns euler21)

(defn divisors [n]
  (filter #(= 0 (rem n %)) (range 1 (+ 1 (int (/ n 2))))))

(defn amicable? [n]
  (let [sum (reduce + (divisors n))
        sum2 (reduce + (divisors sum))]
    (if (and (not= sum sum2) (= sum2 n))
      true
      false)))

(reduce + (filter amicable? (range 10000)))
