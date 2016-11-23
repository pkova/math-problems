(ns euler3)

(def target 600851475143)

(defn prime? [n]
  (if (> 1 n)
    false
    (and (= 0 (mod target n))
         (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n))))))))

(last (filter prime? (range 2 (Math/sqrt target))))
