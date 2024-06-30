package com.globalpayex

List.metaClass.evens={
    delegate.findAll{it%2==0}
}
List.metaClass.odds{
    delegate.findAll{it%2}
}
List.metaClass.sortDesending{
//    delegate.collect().sort{o1,o2->o2.compareTo(o1)}
//      delegate.sort(false){o1,o2->o2.compareTo(o1)}
    delegate.sort(false){o1,o2->o2 <=> o1}   //spaceship (<=>)
}

def nos=[5,8,2,9,4,6,3,6]
println(nos.evens())
println(nos.odds())
println(nos.sortDesending())
println(nos)


