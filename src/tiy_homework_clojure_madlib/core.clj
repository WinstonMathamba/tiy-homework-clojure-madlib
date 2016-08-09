(ns tiy-homework-clojure-madlib.core)

; Creating a mad lib by defining a function mad-lib and passing the words in the arguments.
(defn mad-lib[adj verb bodypart adjer food verbs noun1 noun2 adj3]
                (str "A woman's advice is no " adj " thing, but he won't " verb " it is a fool. Absence makes the " bodypart " grow " adjer ". A/an " food " never "
                     verbs " far from the " noun1 ". Anyone can hold the " noun2
                     " when the sea is " adj3 "."))


(println (mad-lib "beautiful" "run" "arm" "sexier" "pizza" "slices" "house" "car" "crazy"))





