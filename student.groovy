// OOP
// 1. visualize real world actors as something that occupies memory in the ram
// Objects

// 2. Student with his/her characteristics -> Each object must have its own set of attributes
// same attributes, but with their own values

// 3. Actions that we do on a student -> Methods to be called on an object

// data in the memory has a data type
// student object -> Student (convention user defined data type must be capital case)
// class (give a data type to all objects created from a class) - blueprint for an object

// Person X
class Student {
  // object properties (attributes)
  // as a convention, while declaring attributes in a class, consider using static typing
  String name
  Character gender
  Integer roll
  Float marks


  // constructors
  // has the same name as the class
  // has to be called with new (at the time of object creation)
  // no explicit return (default return the object)
  // no def while defining constructor
  // default
  /* Student(Student this) {

  } */

  // constructor overloading
  Student() {

  }

  // parameterized constructor
  // you declare a constructor, u do not get the default constructor
  Student(String name, Character gender, Integer roll, Float marks) {
    // initializing the properties of an object
    this.name = name
    this.gender = gender
    this.roll = roll
    this.marks = marks
  }

  def getDetails() {
    // println this // reference of the current object for which the function is called
    "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"

    // "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}" -> will also work
    // as the lower level code will put this before every attribute name
  }

  // internally
  /*
  def getDetails(Student this) {

  }
  */

  def getGrade() {
    switch (this.marks) {
      // range data can be used in case, since it supports casing
      // NumberRange in order to support Float marks
      case new NumberRange(70, 100): 'A'
        break
      case new NumberRange(60, 69): 'B'
        break
      case new NumberRange(40, 59): 'C'
        break
      case new NumberRange(0, 39): 'F'
        break
      default: 'I'
    }
  }
}


// Person Y
// def s1 = new Student() // 40001 in ram
def s1 = new Student('mehul', 'm' as Character, 10, 90)
// internally
// 1. new -> 40001
// 2. Student('mehul', 'm', 10, 90, 40001)
// s1 -> 40001
def s2 = new Student() // 40006 in ram
// internally
// 1. new -> allocate some memory area in the ram -> 40006
// 2. Student(40006)
// s2 -> 40006

// s1 and s2 are reference variables (address)

// println s1
// println s2

// setting the properties on the individual objects
/* s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 90 */

s2.name = 'jane'
s2.gender = 'f'
s2.roll = 45
s2.marks = 67

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

println s1.getGrade() // Student.getGrade(s1)
println s2.getGrade() // Student.getGrade(s2)
