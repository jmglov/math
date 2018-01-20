(ns math.fractions
  (:refer-clojure :exclude [numerator denominator]))

(defn create [n d]
  [n d])

(defn numerator [f]
  (first f))

(defn denominator [f]
  (second f))

(defn add [a b]
  (create (+ (numerator a) (numerator b))
          (denominator a)))
