(defproject silverspoon "0.1.0-SNAPSHOT"
  :description "A back-end web framework"
  :url "http://github.com/daneb/silverspoon"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring "1.9.4"]
                 [ring/ring-mock "0.4.0"]
                 [selmer "1.12.48"]
                 [mount "0.1.16"]]
  :repl-options {:init-ns silverspoon.core})
