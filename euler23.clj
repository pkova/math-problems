(ns euler23)

(defn divisors [n]
  (filter #(= 0 (rem n %)) (range 1 (+ 1 (int (/ n 2))))))

(defn abundant? [n]
  (if (< n (reduce + (divisors n)))
    true
    false))

(def abundants (set (filter abundant? (range 28124))))

(defn summable? [n coll]
  (some #(contains? coll (- n %)) coll))

(time (reduce + (remove #(summable? % abundants) (range 28124))))
