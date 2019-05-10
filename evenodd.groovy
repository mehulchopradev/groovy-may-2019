def n = 8

// if - else selection statements

/* if (n % 2) { // supports groovy truthy and falsy
  println 'It is odd'
} else {
  println 'It is even'
} */

// if the if-else branch have single statements, we can even use ternary operator
// def ans = n % 2 ? 'It is odd' : 'It is even'
// println ans

// if the number is odd, then print the remainder, else print 'It is even'
// elvis operator ?:
// avoids the repitition of returning the truthy condition by writing it again
def ans = n % 2 ?: 'It is even'
println ans
