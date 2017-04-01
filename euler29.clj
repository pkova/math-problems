(ns euler29)

(defn permutations []
  (for [a (range 2 101)]
    (for [b (range 2 101)]
      (Math/pow a b))))

(->> (permutations)
     flatten
     distinct
     count)
