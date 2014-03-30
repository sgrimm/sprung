(ns sprung.SimpleBean)

(gen-class :name ^{org.springframework.stereotype.Component "SimpleBean"} sprung.SimpleBean
           :implements [sprung.SimpleBeanInterface]
;           :methods [[callSpringBean [] String]]
           :init init
           :state beans
           :constructors {^{org.springframework.beans.factory.annotation.Autowired true} [sprung.HelloConsumer] []})

(defn- -init [consumer]
  [[] {:consumer consumer}])

(defn- -callSpringBean [this]
  (. (get (.beans this) :consumer) (callService)))
