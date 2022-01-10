(ns silverspoon.router)

(def routes (atom {:get [{:path "/test", :file "test_view"}]
                   :put []
                   :patch []
                   :delete []
                   :post []}))

(defn route [method, path, file]
  (swap! routes update (keyword method) merge {:path path :file file}))

(defn routes-by-method [method]
  (get @routes (keyword method)))

(defn find-value-in-hash [value hash]
  (filter (comp #{value} last) hash))

(defn routes-for-method [method]
  (get @routes (keyword method)))

(defn match-route [method path]
  (first (filter (fn [hash] (first (find-value-in-hash path hash)))
                 (routes-for-method method))))

(defn get-render-file [method path]
  (let [file (:file (match-route method path))]
    file))
