(ns euler28)

(def init {:diags [1] :corners 0 :empties 0 :empties-to-corner 1 :size 3})

(defn walker [{:keys [diags size corners empties empties-to-corner] :as memo} curr]
  (if (= size 1003)
    (reduced memo)
    (if (= empties empties-to-corner)
      {:diags (conj diags curr)
       :corners (if (>= corners 3)
                  0
                  (inc corners))
       :empties 0
       :empties-to-corner (if (>= corners 3)
                            (+ 2 empties-to-corner)
                            empties-to-corner)
       :size (if (>= corners 3)
               (+ 2 size)
               size)}
      (update memo :empties inc))))

(reduce + (:diags (reduce walker init (iterate inc 2))))

