# math

Basic maths in Clojure, used for teaching programming to young children.

## Usage

```
lein repl

user=> (require '[math.fractions :as fractions])
nil

user=> (fractions/create 1 3)
[1 3]

user=> (fractions/add (fractions/create 1 3) (fractions/create 1 3))
[2 3]
user=> 
```