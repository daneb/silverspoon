(ns silverspoon.core-test
  (:require [clojure.test :refer :all]
            [silverspoon.core :refer :all]
            [ring.mock.request :as mock]))

(def expected "<html><body>\"Hello Dane!\"</body></html>\n")

(deftest handles-a-get
  (is (= expected
         (handler (mock/request :get "/")))))

(deftest render-a-file-with-vars
  (is (= expected (render-html "test_view" {:name "Dane"}))))
