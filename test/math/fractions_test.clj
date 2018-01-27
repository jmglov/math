(ns math.fractions-test
  (:require [clojure.test :as t]
            [math.fractions :as fractions]))

(t/deftest subtract
  (t/testing "Subtract"
    (t/testing "with different denominators"
      (t/is (= (fractions/create 5 12)
               (fractions/subtract (fractions/create 2 3)
                                   (fractions/create 1 4)))))))

