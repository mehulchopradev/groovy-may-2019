def abc() {
  def c = { println 'hi' }
  c
}

def r = abc()
r()

def pqr() {
  def c2 = {a, b -> a ** b}
  return c2
}

def r2 = pqr()
println r2(4, 3)

def mno(n) {
  // closures can access the enclosing function variables,
  // even after they are returned from the function
  def c3 = {a, b -> (a ** b) + n}
}

def r3 = mno(9)
println r3(4, 3)
