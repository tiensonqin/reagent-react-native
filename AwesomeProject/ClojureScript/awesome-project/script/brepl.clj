(require '[cljs.repl :as repl])
(require '[ambly.core :as ambly])
(let [repl-env (ambly.core/repl-env)]
  (cljs.repl/repl repl-env
                  :watch "src"
                  :watch-fn
                  (fn []
                    (cljs.repl/load-file repl-env
                                         "src/awesome_project/core.cljs"))
                  :analyze-path "src"))
