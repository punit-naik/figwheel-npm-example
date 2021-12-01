(ns org.clojars.punit-naik.figwheel-npm-example.core
  (:require ["left-pad" :as lp]))

(enable-console-print!)

(println "This text is printed from src/org/clojars/punit_naik/figwheel-npm-example/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text (lp "123" 6)}))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  (println "APP STATE" @app-state))
