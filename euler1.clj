(ns euler1)

(defn divisible? [n]
  (let [check-remainder #(= 0 (mod n %))]
    (or (check-remainder 3) (check-remainder 5))))

(reduce + (filter divisible? (range 1000)))
