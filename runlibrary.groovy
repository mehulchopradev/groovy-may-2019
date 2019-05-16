import com.example.college.domain.Book

def b1 = new Book(title: 'Book 1', pages: 100, price: 560)
// Book object to be immutable

// b1.title = 'dfgdfg'
// should not be allowed (setting properties shud be blocked)
/* b1.title = 'dfgdfg'
b1.price = 456
b1.pages = 9000
*/

// should work (getting properties shud be allowed)
println b1.title
println b1.pages
