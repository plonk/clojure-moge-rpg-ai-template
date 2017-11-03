(ns sampleai.core
  (:gen-class)
  (:require [clojure.data.json :as json]))

(defn map-mode [message]
  (println (rand-nth '("UP" "DOWN" "RIGHT" "LEFT" "HEAL"))))

(defn battle-mode [message]
  (println "SWING"))

(defn equip-mode [message]
  (println "YES"))

(defn levelup-mode [message]
  (println "HP"))

(def funcs {:map map-mode
            :battle battle-mode
            :equip equip-mode
            :levelup levelup-mode})

(defn -main
  "まだたいしたことはしません。"
  []

  (println "ClojureサンプルAI")
  (loop [line (read-line)]
    (when line
      (let [msg (json/read-str line :key-fn keyword)
            mode (first (filter #(% msg) (keys funcs)))]
        ((mode funcs) msg)
        (recur (read-line))))))
