(ns euler12)

(defn nth-triangular [n]
  (reduce + (range 0 (inc n))))

(defn divisors [n]
  (* 2 (count (filter #(zero? (mod n %)) (range 1 (inc (Math/sqrt n)))))))

(def divisors-memoize
  (memoize divisors))

(->> (range)
     (map (comp divisors-memoize nth-triangular))
     (take-while (partial >= 500))
     count
     nth-triangular)
