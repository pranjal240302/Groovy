package com.globalpayex

def students=[
        10: Tuple.tuple("pranjal",'f'),
        20: Tuple.tuple("Nisha",'f'),
        30: Tuple.tuple("ravi",'m'),
        40: Tuple.tuple("Niraj",'m')
]
Scanner sc=new Scanner(System.in);
println("Enter roll no: ");
def r=sc.nextInt();


//println(students)

//if(students.containsKey(r)){
//    println("student found")
//}
//else {
//    println("student not found")
//}

def found=students[r]
if(found){
    println("Name:$found.v1\nGender:$found.v2")
}
else{
    println("student not found")
}





