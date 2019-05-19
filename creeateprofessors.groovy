import com.example.college.domain.Professor
import com.example.college.domain.CollegeStudent

def p1 = new Professor(name: 'mehul', gender: 'm', subjects: ['Physics'])
// println p1.getDetails() // Professor.getDetails(p1)
println p1 // println(p1.toString())

p1 << 'Maths' << 'Chemistry' // p1.leftShift('Maths') Operator overloading

println p1.subjects

def name = 'Mehul chopra'
println name // println(name.toString())

def s1 = new CollegeStudent(name: 'jane', gender: 'f', roll: 10, marks: 90)
// println s1.getDetails() // CollegeStudent.getDetails(s1)

p1.giveAttendance()
s1.giveAttendance()
