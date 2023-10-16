(ns bnts.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [ring.adapter.jetty :as ring]
            [hiccup.core :refer [html]]))
(defroutes routes (GET "/teste1" [] "testeaqui"))
(ring/run-jetty routes {:port 8001 :join? false})
