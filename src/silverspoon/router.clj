(ns silverspoon.router)

(def routes (atom {:get [{:path "/test", :file "test_view"}]
                   :put []
                   :patch []
                   :delete []
                   :post []}))

(defn route [method, path, file]
  (println str "Adding route " method path file)
  (swap! routes update (keyword method) merge {:path path :file file}))
