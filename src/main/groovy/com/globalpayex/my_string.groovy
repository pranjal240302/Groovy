package com.globalpayex

String.metaClass.csviFy={
    //delegate<---> this
    delegate.replaceAll " ",","
}

def data="pranjal m 10 90"
println(data.csviFy())

//delegate.sort { a, b -> b <=> a }
