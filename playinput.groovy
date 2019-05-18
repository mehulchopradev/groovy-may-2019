println "Program starts"

Scanner s = new Scanner(System.in)
def n

try {
  n = s.nextInt() // handle the exception
} // a single try can have multiple catch blocks
catch (InputMismatchException e) {
  println "Please enter integer values"
}
catch(e) {
  // global catch all block
  println "Please enter integer values"
  e.printStackTrace() // can be called on every exception object
  // prints the entire stack trace of the exception
}

if (n) {
  def r = n % 2 ? 'Odd' : 'Even'
  println r
}

println "Program ends"
