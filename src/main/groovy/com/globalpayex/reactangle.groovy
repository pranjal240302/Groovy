package com.globalpayex

//def perimeter(length=3, breadth=2) { 2 * (length + breadth) }

def perimeter(Map dimentions){
    2*(dimentions['length']+dimentions['breadth'])
}

def area(length, breadth) { length * breadth }

def statistics(length, breadth) {
    def p = perimeter(length: length,breadth: breadth)
    def a = area(length, breadth)
    Tuple.tuple(p, a)
}

def l1 = 5
def b1 = 3

def p1 = perimeter(length:9,breadth:4)
def a1 = area l1, b1

println "Perimeter is $p1"
println "Area is $a1"

println("Perimeter is ${perimeter(length:4,breadth:9)}") // default value of breadth e.g. 2
println("Perimeter is ${perimeter(length:8,breadth:3)}") // default value of breadth e.g. 2

def t = statistics(l1, b1)
println "Perimeter is ${t.v1}"
println "area is ${t.v2}"


println(perimeter(length:4,breadth:3))
println(perimeter(breadth:8,length:3))
