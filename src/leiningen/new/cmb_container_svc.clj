(ns leiningen.new.cmb-container-svc
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files project-name sanitize-ns]]
            [leiningen.core.main :as main]))

(defn cmb-container-svc
  "Generate Cambia Containerized Service"
  [name & args]
  (let [render (renderer "cmb-container-svc")
        main-ns (sanitize-ns name)
        data {:raw-name name
              :name (project-name name)
              :namespace main-ns
              :sanitized (name-to-path main-ns)}]
    (main/info "Generating fresh 'lein new' cmb-container-svc project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["Dockerfile" (render "Dockerfile" data)]
             [".gitignore" (render ".gitignore" data)]
             ["src/{{sanitized}}/server.clj" (render "server.clj" data)]
             ["src/{{sanitized}}/service.clj" (render "service.clj" data)]
             ["test/{{sanitized}}/service_test.clj" (render "service_test.clj" data)])))

; (ns leiningen.new.pedestal-service
;   (:require [leiningen.new.templates :refer [renderer name-to-path ->files
;                                              project-name sanitize-ns]]))

; (defn pedestal-service
;   "A pedestal service project template."
;   [name & args]
;   (let [render (renderer "pedestal-service")
;         main-ns (sanitize-ns name)
;         data {:raw-name name
;               :name (project-name name)
;               :namespace main-ns
;               :sanitized (name-to-path main-ns)}]
;     (println (str "Generating a pedestal-service application called " name "."))
;     (->files data
;              ["README.md" (render "README.md" data)]
;              ["project.clj" (render "project.clj" data)]
;              ["Capstanfile" (render "Capstanfile" data)]
;              ["Dockerfile" (render "Dockerfile" data)]
;              [".gitignore" (render ".gitignore" data)]
;              ["src/{{sanitized}}/server.clj" (render "server.clj" data)]
;              ["src/{{sanitized}}/service.clj" (render "service.clj" data)]
;              ["test/{{sanitized}}/service_test.clj" (render "service_test.clj" data)]
;              ["config/logback.xml" (render "logback.xml" data)])))
; © 2018 GitHub, Inc.
; Terms
; Privacy
; Security
; Status
; Help
; Contact GitHub
; Pricing
; API
; Training
; Blog
; About
; Press h to open a hovercard with more details.