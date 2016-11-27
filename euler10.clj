(ns euler10)

(defn prime? [n]
  (if (> 1 n)
    false
    (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(->> (iterate inc 2)
     (filter prime?)
     (take-while (partial > 2000000))
     (reduce +))
