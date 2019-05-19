// dynamically injecting a function into an existing class

// metaprogramming
String.metaClass.csv = {
  // println delegate // like 'it', 'this'
  def result = ''
  for (ch in delegate) {
    result += ch + ','
  }

  result
}

List.metaClass.evens = {
  delegate.findAll {
    !(it % 2)
  }
}


def name = 'mehul chopra' // java.lang.String
println name.csv()

def nos = [4, 5, 3, 2, 7, 8, 9, 10] // java.util.ArrayList
println nos.evens()
