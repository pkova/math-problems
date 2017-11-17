(ns euler31)

(def coins [1 2 5 10 20 50 100 200])

(defn solve
  ([]
   (solve coins 0 0))
  ([coins n curr]
     (if (< curr 200)
       (let [c (take-while #(<= (+ curr %) 200) coins)]
         (reduce + (map-indexed #(solve (drop %1 c) n (+ curr %2)) c)))
       1)))
