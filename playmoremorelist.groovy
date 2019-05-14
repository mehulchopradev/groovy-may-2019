def nos = [5, 6, 3, 4, 2, 2, 10, 1, 9]

println 'Print all the elements'
nos.each { println it }

println 'Print all odd elements greeter than 5'
nos.each {
  if (it % 2 && it > 5) {
    println it
  }
}

// from the nos list, need a new list of only odd elements
// filtering
/* def odds = []
nos.each {
  if (it % 2) {
    odds << it
  }
} */

println 'All odd elements'
def odds = nos.findAll { it % 2 }
println odds

println 'All even elements greater than 5'
// new list from nos list, of all even elements greater than 5
def evens = nos.findAll { !(it % 2) && it > 5 }
println evens

// from the nos list, a new list with all the nos minus 1
// mapping
def m1 = nos.collect { it - 1 }
println m1
