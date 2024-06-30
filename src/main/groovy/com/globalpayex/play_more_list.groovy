package com.globalpayex

def nos=[5,6,3,4,9,10,3,7,1,2]

println("=======evens more than 2======")
//nos.each {
//    if(it%2==0 && it>2){
//        println(it)
//    }
//}

def evens=[]
def odds=[]
nos.each {
    if(it%2){
        odds << it
    }
    else{
        evens << it
    }
}
println(evens)
println(odds)


//=======print list elems more than 5
def l1=nos.findAll{it>5}
println(l1)

//
def l2=nos.collect{it-1}
println(l2)


//create new list from nos list
def l3=nos.findAll{it%2 && it>3}.collect{it**2}
println(l3)

def greaterThanThree =nos.every {
    it>3
}
println(greaterThanThree)

def cars = ["audi", "bmw", "i20"]

def newCars=cars.collect{it.capitalize()}
println(newCars)

//Spread Operator  (*.)
def l5=cars*.capitalize()
println(l5)

def l6=nos*.findIndexOf {4}
println(l6)


