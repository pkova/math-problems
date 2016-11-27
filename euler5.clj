(ns euler5)

(defn divisible-by-all? [n]
  (every? #(zero? (mod n %)) (range 11 21)))

(first (filter divisible-by-all? (iterate (partial + 20) 20)))
