import com.example.geometry.Square
import com.example.geometry.Rectangle
import com.example.geometry.Shape

Shape s = new Square(side: 4)
// a super class reference variable type can hold a sub class object address
Rectangle r = new Rectangle(length: 5, breadth: 3)

/* println s.area()
println s.perimeter()

println r.area()
println r.perimeter() */

/* println (CalcStats.calculate(s))
println (CalcStats.calculate(r))

println (CalcStats.calculate("mehul")) // gives an error
*/

s.printType()
