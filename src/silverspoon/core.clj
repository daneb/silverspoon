(ns silverspoon.core
  (:require [selmer.parser :refer :all]
            [silverspoon.router :refer :all]))

(def setting {:view_engine "selmer", :views (str (System/getProperty "user.dir") "/sample_app/views")})

(defn render-html [file, locals]
  (selmer.parser/set-resource-path! (get setting :views))
  (selmer.parser/render-file (str file  ".html") locals))

(defn request-params [request]
  (let [path (:uri request)
        method (:request-method request)]
    (silverspoon.router/get-render-file method path)))

(defn handler [request]
  (let [file (request-params request)]
    (println file)
    (if (string? file)
      {:status 200 :body (render-html file {:name "Dane"})}
      {:status 400 :body "Not Found"})))

(def app
  (-> handler))
