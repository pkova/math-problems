(ns euler2)

(def fib (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(reduce + (filter even? (take-while (partial > 4000000) fib)))
