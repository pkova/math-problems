(ns euler25)

(defn digits
  ([n] (digits n 1))
  ([n sum]
   (if (< n 10)
     sum
     (recur (/ n 10) (inc sum)))))

(def fib (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(count (take-while #(> 300 (digits %)) fib))
