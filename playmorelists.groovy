def nos = [5, 6, 3, 4, 2, 2, 10, 1, 9]

// print all the elements of the list
// Imperative programming
println 'Printing all the elements of a list'
for(n in nos) {
  println n
}

// print only the even elements from the list
println 'Printing even elements'
for (n in nos) {
  if (!(n % 2)) {
    println n
  }
}

// common construct
// iterating through every item of the list

// dynamic construct
// printing n - 1st example
// printing only even n's - 2nd example
// code that we would want to pass to the higher order function

def forEach(elements, fn) {
  for(item in elements) {
    fn(item)
  }
}

// println 'All elements'
// code (lower order function) -> higher order functioon -> prints the item
// Functional programming

// functions are not treated as objects in the language
// hence functions cannot be passed as an argument to a function

// so the below is not going to work
/* def printElement(ele) {
  println ele
}
forEach nos, printElement


println 'Even elements'
// code -> higher order function -> println only the even item
def printEvenElement(ele) {
  if (!(ele % 2)) {
    println ele
  }
}
forEach nos, printEvenElement */

// Closures
// its like a function; but is treated as an object in the groovy language
// closures can be passed around

println 'All Elements'
// def printAll = {ele -> println ele}
// def printAll = { println it } // if a closure has only one argument, we can drop off the argument declaration
// and consider the default name of the argument as "it"
// forEach nos, printAll
// forEach nos, { println it }
forEach(nos, { println it })

println 'Even elements'
/* def printEven = {
  if (!(it % 2)) {
    println it
  }
} */
// forEach nos, printEven

// valid only when closure has to be passed as the last argument to the function
forEach(nos) {
  if (!(it % 2)) {
    println it
  }
}
