def n = 23

// def i = 0 // init

// while statement (looping)

/* while (i <= n) { // checking
  if (!(i % 2)) {
    println i
  }
  i += 1 // incrementing
} */

// for statement (looping)

// traditional for loop
/* for (i = 0; i<= n ; i++ ) {
  if (!(i % 2)) {
    println i
  }
} */

// enhanced groovy for loop
// no init, no checking, no incrementing/decrementing

// concentrate on building that collection of elements that will be fed to the for loop
for (i in (0..n).by(2)) { // range data
  // setting step size using the by method on the range object
  /* if (!(i % 2)) {
    println i
  } */
  println i
}
