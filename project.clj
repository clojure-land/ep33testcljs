(defproject ep33testcljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.671"]
                 [lein-doo "0.1.7"]]

  :plugins [[lein-figwheel "0.5.11"]
            [lein-cljsbuild "1.1.6"]
            [lein-doo "0.1.7"]]

  :cljsbuild {:builds
              [{:id "dev"
                :figwheel true
                :source-paths ["src"]
                :compiler {:main testcljs.core
                           :optimizations :none
                           :output-dir "resources/public/js/out"
                           :asset-path "js/out"
                           :output-to "resources/public/js/app.js"}}

               {:id "test"
                :source-paths ["src" "test"]
                :compiler {:main testcljs.test-runner
                           :optimizations :whitespace
                           :output-dir "resources/public/js/out/test"
                           :output-to "resources/public/js/test.js"}}]})
