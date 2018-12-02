(ns advent-2018.utils
  (:require 
    [clojure.string :as string]
    [clojure.java.io :as io])
  (:gen-class))

(defn open-file
  [path]
  (io/reader (.getFile (io/resource path))))

(defn parse-file
  [path]
  (with-open [rdr (open-file path)]
    (reduce conj [] (line-seq rdr))))

(defn parse-file-of-numbers
  [path]
  (map read-string (parse-file path)))
