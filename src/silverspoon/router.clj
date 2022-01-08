(ns silverspoon.router)

(def routes (atom {:get [{:path "/test", :file "test_view"}]
                   :put [{}]
                   :patch [{}]
                   :delete [{}]
                   :post [{}]}))

(defn route [method, path, file]
  swap! routes update (keyword method) merge {:path path :file file})

(add-watch @routes :logger (fn [key state old-value new-value]
                             (println "Route was changed to:" (:get old-value new-value))))
