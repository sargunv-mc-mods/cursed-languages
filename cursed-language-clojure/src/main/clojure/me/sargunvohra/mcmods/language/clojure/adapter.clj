(ns me.sargunvohra.mcmods.language.clojure.adapter
  (:import (net.fabricmc.loader.api LanguageAdapter)
           (net.fabricmc.loader.util DefaultLanguageAdapter)))

(deftype Adapter []
  LanguageAdapter
  (create [_ modContainer entryPoint interface]
    (.create DefaultLanguageAdapter/INSTANCE modContainer entryPoint interface)))
