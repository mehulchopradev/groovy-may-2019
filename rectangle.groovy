// global variables
// can be accessed anywhere in the file (except function definitions)
def l1 = 5
def b1 = 3

def perimeter(length, breadth=2.5) {
  // length, breadth are local to the perimeter function
  2 * (length + breadth)
}

def area(length, breadth) {
  length * breadth
}

// while calling functions, drop off paranthesis for the parameter list
def p = perimeter l1, b1
def a = area l1, b1

println p // built in function  println, print
println a
