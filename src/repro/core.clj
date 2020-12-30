(ns repro.core
  (:require [cljfx.api :as fx]))

(def context (atom nil))
  
(fx/create-app context)
