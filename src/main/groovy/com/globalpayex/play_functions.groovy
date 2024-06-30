package com.globalpayex

//closure
// very much like functions
//closure value-parameters, body,
def operations(a,b){
    //compute addition
    def add={
        //closure can acces enclosing scope data
        def add=a+b
        add+10
    }
    def multiplication={
        def r2=a*b
        r2+10
    }
    //compute multiplication
    println(add())
    println(multiplication())
}

operations(3,4)

def nos=[5,6,2,8,7,2,4]

//general purpose function
def forEach(list,fn){
    for(def element in list){
        fn(element)
    }
}
println ("==========evens============")
def fn={element->
    if(element%2==0){
        println(element)
    }

}
forEach(nos,fn)
println ("==========odd more than 3============")
//forEach(nos,{element->
//    if(element%2 && element>3){
//        println(element)
//    }
//})
//forEach(nos,{
//    if(it%2 && it>3){
//        println(it)
//    }
//})

forEach(nos){
    if(it%2 && it>3){
        println(it)
    }
}