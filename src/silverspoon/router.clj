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

(defn find-value-in-hash [value hashes]
  (filter (comp #{value} last) hashes))

(defn match-route [method path]
  (first (filter (fn [hashes]
                   (find-value-in-hash path hashes))
                 (get @routes (keyword method)))))
