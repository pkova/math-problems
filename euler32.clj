(ns euler31
  (:require [clojure.string :as str]))

(defn pandigital? [i n x]
  (let [numbers (set (map str (range 1 10)))]
    (and
      (= x (* i n))
      (= numbers (set (map str (str i n x)))))))

(defn pandigital-2? [n]
  (let [numbers #{"1" "2" "3" "4" "5" "6" "7" "8" "9"}]
    (= numbers (set (map str (str n))))))

(defn ok-number-base? [n & r]
  (let [s (map str (str n))
        str-set (set s)
        prev-set (set (map str (apply str r)))]
    (if (or (contains? str-set "0") (not (empty? (clojure.set/intersection str-set prev-set))))
      false
      (>= (count (set s)) (count s)))))

(def ok-number? (memoize ok-number-base?))

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

(def lel (doall (pmap factorize (range 1000 10000))))