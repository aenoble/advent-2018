(ns advent-2018.day-one-test
  (:require [clojure.test :refer :all]
            [advent-2018.day-one :refer :all]))

(deftest part-one-test
  (testing "Day One - Part One"
    (is (= 1 1))
    (is (= 3 (part-one [1 1 1])))
    (is (= 0 (part-one [1 1 -2])))
    (is (= -6 (part-one [-1 -2 -3])))))

(deftest part-two-test
  (testing "Day One - Part Two"
    (is (= 0 (part-two [1 -1])))
    (is (= 10 (part-two [3 3 4 -2 -4])))
    (is (= 5 (part-two [-6 3 8 5 -6])))
    (is (= 14 (part-two [7 7 -2 -7 -4])))))
