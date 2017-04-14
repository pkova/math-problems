(ns euler30
  (:require [clojure.string :as str]))

(defn fifth-power-sum [n]
  (int (reduce + (map #(Math/pow (Character/digit % 10) 5) (seq (str n))))))

(reduce + (filter #(= % (fifth-power-sum %)) (range 2 200000)))
