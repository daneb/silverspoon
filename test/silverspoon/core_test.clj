(ns silverspoon.core-test
  (:require [clojure.test :refer :all]
            [silverspoon.core :refer :all]
            [ring.mock.request :as mock]))

(deftest handles-a-get
  (is (= (handler (mock/request :get "/"))
         {:status 200
          :headers {"Content-Type" "text/html"}
          :body "Hello World"})))
