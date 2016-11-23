(ns euler5)

(defn divisible-by-all? [n]
  (every? #(= 0 (mod n %)) (range 11 21)))

(first (filter divisible-by-all? (iterate #(+ % 20) 20)))
