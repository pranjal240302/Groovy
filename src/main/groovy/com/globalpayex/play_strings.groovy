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

def ran
def ranm="          "
println(ranm.isAllWhitespace())


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




