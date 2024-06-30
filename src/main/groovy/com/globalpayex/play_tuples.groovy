package com.globalpayex

// Tuple
// Heterogenous data
// ordered
// immutable

def t1 = Tuple.tuple("pranjal", 10, 'm', 90)

// access elements
println t1.v1
println t1.v3
println t1.v4

// iterate
for(def v in t1) {
    println v
}

// modify
// t1.v1 = "nisha" // cannot modify
// t1.v2 = 11

// t1.push("india")

