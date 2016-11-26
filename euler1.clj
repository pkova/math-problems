(ns euler1)

(defn divisible? [n]
  (let [remainder? #(zero? (mod n %))]
    (or (remainder? 3) (remainder? 5))))

(reduce + (filter divisible? (range 1000)))
