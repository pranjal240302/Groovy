package com.globalpayex

def students=[
        10: Tuple.tuple("pranjal",'f',10),
        20: Tuple.tuple("Nisha",'f',20),
        30: Tuple.tuple("ravi",'m',30),
        40: Tuple.tuple("Niraj",'m',40)
]

//print the name and roll number of all the female students

students.each {
    if(it.value.v2=='m'){
        println("Name: $it.value.v1\nRoll:$it.key")
    }
}

students.each { roll,studentTuple->
    if(studentTuple.v2=='m'){
        println("Name: $studentTuple.v1\nRoll:$roll")
    }
}

//def m2=students.findAll {it.value.v2=='f'}
//println(m2)

def m2=students.findAll {roll,studnetTuple->
    studnetTuple.v2=='f'
}
println(m2)


def m3=students.collectEntries {roll,studentTuple->
    [roll,Tuple.tuple(studentTuple.v1.capitalize(),studentTuple.v2,studentTuple.v3)]
}
println(m3)

//def m4=students.countBy {gender,studentTuple->
//    [gender,]
//}

def m4=students.countBy {it.value.v2}
println(m4)

def m5=students.groupBy {it.value.v2}
println(m5)