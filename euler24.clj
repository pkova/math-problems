(ns euler24
  (:require [clojure.math.combinatorics :as combo]))

(def chars [\0 \1 \2 \3 \4 \5 \6 \7 \8 \9])

(combo/nth-permutation chars 999999)
