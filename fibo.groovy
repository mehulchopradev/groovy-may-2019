def n = 10

// print the first 8 fibonacii numbers
// 0 1 1 2 3 5 8 13
// a b c
//   a b c
//     a b c

def a = 0
def b = 1

println a
println b

// looop
// collection that we will feed to the for loop (n - 2)
for(i in 1..n-2) {
  def c = a + b // c is a local variable to the for loop
  println c
  a = b
  b = c
}

println c // this will not work
// scope of every variable in groovy is block scoped ({})
