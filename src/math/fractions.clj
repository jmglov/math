(ns math.fractions
  (:require [math.core :as core])
  (:refer-clojure :exclude [numerator denominator]))

(defn create [n d]
  [n d])

(defn numerator [f]
  (first f))

(defn denominator [f]
  (second f))

(defn multiply [a b]
  (create (* (numerator a) (numerator b))
          (* (denominator a) (denominator b))))

(defn normalize [a b]
  (let [a2 (multiply a (create (denominator b)
                         (denominator b)))
        b2 (multiply b (create (denominator a)
                         (denominator a)))]
    [a2 b2]))

(defn add [a b]
  (let [[a2 b2] (normalize a b)] 
    (create (+ (numerator a2) (numerator b2))
      (denominator a2))))

(defn subtract [a b]
  (let [[a2 b2] (normalize a b)] 
    (create (- (numerator a2) (numerator b2))
      (denominator a2))))

