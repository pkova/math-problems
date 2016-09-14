(ns euler20)

(defn fact [n sum]
  (if (= n 1)
    sum
    (recur (dec n) (*' n sum))))

(defn adder [n sum]
  (if (< n 1)
    sum
    (recur (/ n 10) (+ sum (int (rem n 10))))))

(adder (fact 100 1) 0)
