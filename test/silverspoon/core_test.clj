(ns silverspoon.core-test
  (:require [clojure.test :refer :all]
            [silverspoon.core :refer :all]
            [ring.mock.request :as mock]))

(def expected "<html><b>Test Page</b></html>\n")

(deftest handles-a-get
  (is (= expected
         (handler (mock/request :get "/?search=car")))))

(deftest render-a-file
  (is (= expected (render-html "test_view" {}))))
