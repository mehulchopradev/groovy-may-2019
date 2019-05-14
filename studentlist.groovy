/* def students = [new Student('mehul', 'm' as Character, 10, 90),
  new Student('jane', 'f' as Character, 3, 67),
  new Student('jill', 'f' as Character, 23, 80)]

students.findAll { it.marks >= 80 }.each { println it.name }

def search = 23
def foundStudent = students.find { it.roll == search }
if (foundStudent) {
  println foundStudent.name
} else {
  println "Not found"
} */

def smap = [
  10: new Student('mehul', 'm' as Character, 10, 90),
  3: new Student('jane', 'f' as Character, 3, 67),
  23: new Student('jill', 'f' as Character, 23, 80)
]

def search = 34
def foundStudent = smap[search]
if (foundStudent) {
  println foundStudent.name
} else {
  println "Not found"
}
