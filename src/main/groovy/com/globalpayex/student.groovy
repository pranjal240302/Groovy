package com.globalpayex

def students=[
        Tuple.tuple("pranjal",'f',90),
        Tuple.tuple("vidhi",'f',80),
        Tuple.tuple("kunal",'m',60),
        Tuple.tuple("ravi",'m',68),
        Tuple.tuple("nidhi",'f',80)
]

def maxTuple=students[0]
for (def student in students){
    if(student.v3>maxTuple.v3){
        maxTuple=student
    }
}
println("Name:$maxTuple.v1\nGender:$maxTuple.v2\nmarks:$maxTuple.v3")




