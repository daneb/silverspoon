(ns silverspoon.core)

;; (defn keywordize [kvp]
;;   (let [[k, v] kvp]
;;     [(keyword (.replace k "--" "")) v]))

;; (defn parse-args [args]
;;   (into {} (map (fn [[k v]] [(keyword (.replace k "--" "")) v])
;;                 (partition 2 args))))
;;
(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})
