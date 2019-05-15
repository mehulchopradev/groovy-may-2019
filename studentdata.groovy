// println Student.count // getting the value of a static variable
// Person Y
// def s1 = new Student() // 40001 in ram
def a1 = new Address('city': 'Mumbai', 'country': 'India', 'state': 'MH') // calling the map base constructor available in every groovy bean
// def s1 = new Student('mehul', 'm' as Character, 10, 90, a1) // positional arguments
def s1 = new Student(name: 'mehul', gender: 'm' as Character, roll: 10, marks: 90, address: a1)
// internally
// 1. new -> 40001
// 2. Student('mehul', 'm', 10, 90, 40001)
// s1 -> 40001
def s2 = new Student() // 40006 in ram
// internally
// 1. new -> allocate some memory area in the ram -> 40006
// 2. Student(40006)
// s2 -> 40006

// println Student.count

// s1 and s2 are reference variables (address)

// println s1
// println s2

// setting the properties on the individual objects
/* s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 90 */

s2.name = 'jane'

s2.gender = 'p'
// internally s2.setGender('o')

s2.roll = 45
s2.marks = 67

// println s2.gender
// internally s2.getGender()

// getting the properties of the individual objects
/* println s1.name
println s2.name
println s1.gender
println s2.gender */


def d2 = s2.getDetails()
// internally
// def d2 = Student.getDetails(s2)

def d1 = s1.getDetails()
// internally
// def d1 = Student.getDetails(s1)

println d1
println d2

// println s1.getGrade() // Student.getGrade(s1)
// println s2.getGrade() // Student.getGrade(s2)

// println Student.count

// println Student.getMandatoryAttendance() // static function (internally Student.getMandatoryAttendance())
// in order to call them, no object needs to be created
