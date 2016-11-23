(ns euler6)

(def sum-of-squares (reduce + (map #(* % %) (range 100))))

(def square-of-sum (Math/pow (reduce + (range 100)) 2))

(int (- square-of-sum sum-of-squares))

