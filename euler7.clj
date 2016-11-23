(ns euler7)

(defn prime? [n]
  (if (> 1 n)
    false
    (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(nth (filter prime? (iterate inc 2)) 10000)
