(ns silverspoon.main
  (:use ring.adapter.jetty)
  (:require [silverspoon.core :as web]))

(defn -main
  "Entry point"
  [& args]
  (do
    (run-jetty #'web/app {:port 8080}));END;do
);END: main
