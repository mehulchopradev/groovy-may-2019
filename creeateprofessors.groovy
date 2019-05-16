import com.example.college.domain.Professor
import com.example.college.domain.CollegeStudent

def p1 = new Professor(name: 'mehul', gender: 'm', subjects: ['Phyics', 'Maths'])
// println p1.getDetails() // Professor.getDetails(p1)
println p1 // println(p1.toString())

def name = 'Mehul chopra'
println name // println(name.toString())

def s1 = new CollegeStudent(name: 'jane', gender: 'f', roll: 10, marks: 90)
// println s1.getDetails() // CollegeStudent.getDetails(s1)

p1.giveAttendance()
s1.giveAttendance()
