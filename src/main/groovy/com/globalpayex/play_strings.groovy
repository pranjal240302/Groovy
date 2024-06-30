package com.globalpayex

def fullName="pranjal choudhari"
def msg="good morning"
def addition="addition is:${4+3}"

def sql='''
       select username,passworf
       from users
       where username='abc'
'''
//println(sql)
//
//// ====================indexing====================
//println(msg[-1])
//println(msg[1])
//println(msg[3])
//
////=====================substring=====================
//println(msg[0..4])
//println(msg[-4..-1])
//
////======================iterate=======================
//for(def v in msg){
//    println(v)
//}

//====================other operation======================

println(fullName.toUpperCase())
println(msg.capitalize())
println(msg.toUpperCase())
println(msg.count("good"))
println(msg.reverse())
println(msg.size())


def ranm="          "
println(ranm.isAllWhitespace())


def m1="pranjal choudhari"
def m2="pranjal"
def m3=m2+" choudhari"
def m4="pranjal choudhari"

println(m1)
println(m3)

println(m1==m3) //equals

println(m1===m3)    //compare addresses
println(m1===m4)






//---------------------sir-------------------
//def fullName = "mehul chopra"
//def msg = 'good morning'
//def addition = "Addition is ${4 + 3}"
//
//def sql = '''
//    select username, password
//    from users
//    where username = 'abc'
//'''
//println sql
//
//// indexing
//println msg[0]
//println msg[3]
//println msg[-1]
//println msg[-3]
//
//// substring
//println fullName[0..4]
//println msg[-4..-1]
//
//// iteration
//for(def v in msg) {
//    println v
//}
//
//// other operations
//println fullName.toUpperCase()
//println msg.capitalize()
//println msg.startsWith("good")
//println msg.endsWith("night")
//println fullName.contains("hul")
//
//def msg1 = 'good morning to all. have a good day ahead'
//println msg1.count("good")
//
//def age = '37'
//println age.isNumber()
//def pi = '3.14'
//println pi.isFloat()
//def username = "mehul25"
//println username.isNumber()
//
//println fullName.reverse()
//
//println fullName.size()
//
//def studentData = '        mehul,m,10,90                            '
//println studentData.strip()
//
//def maliciousData = '    '
//println maliciousData.isAllWhitespace()




