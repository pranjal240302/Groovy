package com.globalpayex


def em=[:]
def smap=[E00:"mehul",E002:"nisha"]

//add new entry
smap['E003']='NIRAJ'
println(smap)

//update
smap['E00']="pranjal"
println(smap)

//remove
smap.remove('E003')
println(smap)

println(smap.size())
println(smap.keySet())
println(smap.values())

//ieration
for(def entry in smap){
    println("Emp id: $entry.key\nEmp name: $entry.value")
}

//membership
println('EOO3' in smap)
println('EOO' in smap)
