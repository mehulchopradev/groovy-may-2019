// the below variables are just 4 separate variables not grouped
// and do not tell that they are attributes of a student
def name = 'mehul'
def gender = 'm'
def roll = 10
def marks = 45

def getDetails(name, gender, roll, marks) {
  // string interpolation -> declare in ""
  "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
}

def getGrade(marks) {
  switch (marks) {
    // range data can be used in case, since it supports casing
    case 70..100: 'A'
      break
    case 60..69: 'B'
      break
    case 40..59: 'C'
      break
    case 0..39: 'F'
      break
    default: 'I'
  }
}

// the action (methods) are called on their own
// not called on a student
// and manually data needs to be passed to these functions
def d = getDetails name, gender, roll, marks
println d

def g = getGrade marks
println g
