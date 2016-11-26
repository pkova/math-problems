(ns euler9)

(defn exp [x n]
  (reduce * (repeat n x)))

(for [m (range 2 32)
      n (range 1 (- m 1))
      :let [a (- (exp m 2) (exp n 2))
            b (* 2 m n)
            c (+ (exp m 2) (exp n 2))]
      :when (= 1000 (+ a b c))]
  (* a b c))
