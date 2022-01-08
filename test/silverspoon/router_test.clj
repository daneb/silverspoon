(ns silverspoon.core-test
  (:require [clojure.test :refer :all]
            [silverspoon.router :refer :all]))

(def expected {:get [{:path "/test", :file "test_view"}]
               :put []
               :patch []
               :delete []
               :post []})

(deftest supports-default-routes
  (is (= expected
         (deref silverspoon.router/routes))))

