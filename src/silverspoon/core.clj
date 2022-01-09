(ns silverspoon.core
  (:require [selmer.parser :refer :all]
            [silverspoon.router :refer :all]))

(def setting {:view_engine "selmer", :views "/Users/danebalia/html"})

(defn render-html [file, locals]
  (selmer.parser/set-resource-path! (get setting :views))
  (selmer.parser/render-file (str file  ".html") locals))

(defn request-params [request]
  (let [path (:uri request)
        method (:request-method request)]
    (silverspoon.router/get-render-file method path)))

(defn handler [request]
  (println request)
  (let [file (request-params request)]
    (if (string? file)
      (render-html file {})
      {:status 400 :body "Not Found"})))
