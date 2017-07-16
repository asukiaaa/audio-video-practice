(ns audio-video-practice.core
  (:require [overtone.live :as l]
            [overtone.inst.piano :as p]
            [overtone.at-at :as at]))

(def my-pool (at/mk-pool))

(defn- main []
  (at/after 100 #(l/recording-start "overtone.wav") my-pool)
  (at/after 1000 #(p/piano) my-pool)
  (at/after 2000 #(p/piano 70) my-pool)
  (at/after 3000 #(p/piano 80) my-pool)
  (at/after 4000 #(l/recording-stop) my-pool)
  (at/after 5000 #(. System exit 0) my-pool))
