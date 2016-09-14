(ns euler22
  (:require [clojure.string :as str]))

(def s (sort (str/split (str/replace (slurp "names.txt") "\"" "") #",")))

(reduce +
        (map-indexed (fn [idx [& chars]]
                       (* (inc idx) (reduce + (map #(- (int %) 64) chars))))
                     s))
