package `7_OOPS`


//Q: console-based school management system
//Use inheritance for different roles (Student, Teacher, Staff)
//Use encapsulation for sensitive data like salary
//Use polymorphism for different user behaviors
//Use an abstract class or interface for a common contract like UserProfile

interface userprofile{
    fun showprofile()
}
abstract class users(
    var id:Int,
    var name: String
): userprofile

class students(id: Int,name: String,val grade: String): users(id,name){
    override fun showprofile() {
        println("Student ID: $id, Name: $name, Grade: $grade")
    }
}

class Teacher(id: Int,name: String,private var salary: Double,val subject: String): users(id,name){
    fun getsalary(): Double=salary
    fun setsalary(newsalary: Double){
        if (newsalary>0) salary=newsalary
    }
    override fun showprofile() {
        println("Teacher ID: $id, Name: $name, Subject: $subject")
    }
}
class Staff(id: Int,name: String,private var salary: Double,val dep: String): users(id,name){
    fun getsalary(): Double=salary
    fun setsalary(newsalary: Double){
        if (newsalary>0) salary=newsalary
    }
    override fun showprofile() {
        println("Staff ID: $id, Name: $name, Department: $dep")
    }
}

fun main() {
    val stu= students(1,"Hamza","A")
    val teacher= Teacher(22,"Hassan",44000.0,"Math")
    val staff= Staff(29,"Ali",22000.0,"Admin")

    val users=listOf<userprofile>(stu,teacher,staff)
    for(user in users){
        user.showprofile()
    }

    println("original salary of teacher ${teacher.getsalary()}")
    teacher.setsalary(50000.0)
    println("Update  salary of teacher ${teacher.getsalary()}")
}





























