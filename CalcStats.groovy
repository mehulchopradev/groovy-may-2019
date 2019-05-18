import com.example.geometry.Shape

class CalcStats {
  static def calculate (shape) {
    if (shape instanceof Shape) {
      def a = shape.area()
      def p = shape.perimeter()

      "Area: ${a}\nPerimeter: ${p}"
    } else {
      // exceptional error situation that has occured in the execution of this function
      // do not return according to what the function needs to return
      // 'Cannot calculate' -> dont do this
      // rather, throw an error to the caller of this function
      // throw new IllegalArgumentException('Can calculate only something which is a shape')
      throw new IllegalShapeException('Can calculate only something which is a shape')
    }
  }
}
