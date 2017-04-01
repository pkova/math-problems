(ns euler27)

(defn prime? [n]
  (if (> 1 n)
    false
    (every? #(not= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n)))))))

(defn formula [a b n]
  (+ (* n n) (* a n) b))

(defn consecutive-primes [a b]
  (->> (range)
       (map (partial formula a b))
       (take-while prime?)
       count))

(apply max-key :consecutive-primes
       (flatten (for [a (range -999 1000)]
                  (for [b (range -1000 1001)]
                    {:product (* a b) :consecutive-primes (consecutive-primes a b)}))))
