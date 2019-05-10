def marks = 100

/*
70 - 100 -> A
60 - 69 -> B
40 - 59 -> C
0 - 39 -> F
> 100 or < 0 - I
*/

// if - else if - else if - * - else

/* if (marks > 100 || marks < 0) {
  println 'I'
} else if (marks >= 70) {
  println 'A'
} else if (marks >= 60) {
  println 'B'
} else if (marks >= 40) {
  println 'C'
} else {
  println 'F'
} */

switch (marks) {
  // range data can be used in case, since it supports casing
  case 70..100: println 'A'
    break
  case 60..69: println 'B'
    break
  case 40..59: println 'C'
    break
  case 0..39: println 'F'
    break
  default: println 'I'
}
