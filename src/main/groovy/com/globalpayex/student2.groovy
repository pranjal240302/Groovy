package com.globalpayex


def students=[
        Tuple.tuple("pranjal",'f',90),
        Tuple.tuple("vidhi",'f',80),
        Tuple.tuple("kunal",'m',60),
        Tuple.tuple("ravi",'m',68),
        Tuple.tuple("nidhi",'f',80)
]

Scanner sc=new Scanner(System.in);
println("Enter roll no: ");
def r=sc.nextInt();

def found
for (def student in students){
    if(student.v3==r){
        found=student
        break
    }
}
if(found){
    println("Name:$found.v1\nGender:$found.v2\nmarks:$found.v3")
}
else {
    println("student not found")
}


