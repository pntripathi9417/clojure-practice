(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I am a little teapot"))

(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo Choo!"))

(+ 1  (* 3 4 5))

(str "hello world" "I am awesome")

(if true
  "I AM TRUE"
  "I AM FALSE"
  )

(if false
  "I AM TRUE"
  "I AM FALSE")

(def test-str ["Hello", "World", "My"])

(println test-str)

(defn too-enthusiastic
  [name]
