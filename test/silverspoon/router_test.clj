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

(deftest matches-route
  (is (= {:path "/test" :file "test_view"}
         (silverspoon.router/match-route "get" "/test"))))

(deftest only-render-file
  (is (= "test_view"
         (silverspoon.router/get-render-file "get" "/test"))))
