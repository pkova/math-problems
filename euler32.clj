(ns euler31)

(defn pandigital? [i n x]
  (let [numbers (set (map str (range 1 10)))]
    (and
      (= x (* i n))
      (= numbers (set (map str (str i n x)))))))


(defn factorize [n]
  (let [one-and-four (for [i (range 1 9)
                           j (range 1000 10000)
                           :when (= n (* i j))]
                      [i j n])
        two-and-three (for [i (range 10 100)
                            j (range 100 1000)
                            :when (= n (* i j))]
                       [i j n])]
    (filter #(apply pandigital? %) (concat one-and-four two-and-three))))

(reduce + (map (comp last first) (remove empty? (doall (pmap factorize (range 1000 10000))))))
