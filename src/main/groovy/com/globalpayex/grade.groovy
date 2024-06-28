package com.globalpayex

//def computeGrade(n){
//    if(n>=70 && n<=100){
//        return 'A';
//    }
//    else if(n>=60 && n<70){
//        return 'B';
//
//    }
//    else if(n>=40 && n<60){
//        return 'C';
//    }
//    else if(n<40 && n>0){
//        return 'F';
//    }
//    else{
//        return 'I';
//    }
//}


def computeGrade(marks){
    switch (marks){
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..49:"C"
            break
        case 0..39: "F"
            break
        default :"I"
    }
}

println("Grade is ${computeGrade(-10)}")
println("Grade is ${computeGrade(10)}")
println("Grade is ${computeGrade(90)}")
println("Grade is ${computeGrade(45)}")