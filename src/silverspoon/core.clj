(ns silverspoon.core
  (:require [selmer.parser :refer :all]))

(def setting {:view_engine "hiccup", :views "/Users/danebalia/html"})

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn html [file, locals]
  (selmer.parser/set-resource-path! (get setting :views))
  (selmer.parser/render-file (str file  ".html") locals))
