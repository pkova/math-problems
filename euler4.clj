(ns euler4)

(defn palindrome? [n]
  (= (seq (str n)) (reverse (str n))))

(def products
  (for [a (range 100 1000)
        b (range 100 1000)]
    (* a b)))

(apply max (filter palindrome? products))
