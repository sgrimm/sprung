(defproject sprung "0.1.0"
  :description "TODO"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.1"]
                 [org.springframework/spring-core "3.2.0.RELEASE"]
                 [org.springframework/spring-context "3.2.0.RELEASE"]
                 [org.springframework/spring-test "3.2.0.RELEASE"]] 
  :profiles {:dev {:dependencies [[junit/junit "4.8.2"]]}}
  :plugins [[lein-junit "1.1.2"]]
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"
                      "src/test/java"]
  :junit ["src/test/java"])
