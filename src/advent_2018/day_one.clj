(ns advent-2018.day-one
  (:require [advent-2018.utils :refer :all])
  (:gen-class))

(def input 
  (parse-file-of-numbers "day-one-input.txt"))

(defn part-one
  "Sum an array."
  [coll]
  (reduce + coll))

(defn part-two
  "Find sum that occurs twice in infinitely repeating coll."
  [coll]
  (loop [seqs (cycle coll)
         freqs #{0}
         acc 0]
    (let [total (+ (first seqs) acc)]
      (if (contains? freqs total)
        total
        (recur (rest seqs)
               (conj freqs total)
               total)))))
