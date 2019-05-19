import com.example.college.domain.Book

def bl1 = new BookList(books: [
  new Book(title: 'Book 1', pages: 900, price: 1000),
  new Book(title: 'Book 2', pages: 500, price: 700),
  new Book(title: 'Book 3', pages: 900, price: 350)
])

def bl2 = new BookList(books: [
    new LibBook(name: 'Book 100', price: 900, noOfPages: 500),
    new LibBook(name: 'Book 200', price: 400, noOfPages: 300)
])

// dynamic methods
// cannot be defined directly inside the BookList class
// the naming of this methods depend on what that paricular booklist object is storing
def r1 = bl1.findAllByPages 900
def r2 = bl2.findAllByNoOfPages 300

println r1
println r2

def r3 = bl1.findAllByTitle 'Book 2'
def r4 = bl2.findAllByName 'Book 100'

println r3
println r4

// bl1.xyz 90, 80, 45
