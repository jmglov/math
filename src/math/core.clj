(ns math.core)



(defn gcd
  "Returns the greatest common denominator of a and b

  https://rosettacode.org/wiki/Least_common_multiple#Clojure"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm
  "Returns the least common multiple of a and b

  https://rosettacode.org/wiki/Least_common_multiple#Clojure"
  [a b]
  (/ (* a b) (gcd a b)))

