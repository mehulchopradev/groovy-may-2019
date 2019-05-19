class BookList {
  List books

  def methodMissing(String methodName, args) {
    // println methodName
    // println args
    if (methodName.startsWith('findAllBy')) {
      def propName = methodName['findAllBy'.size()..methodName.size() - 1]
      propName = propName[0].toLowerCase() + propName[1..propName.size() - 1]

      this.books.findAll {
        it[propName] == args[0]
        // in order to use a variable (that stores the actual prop name) with an object,
        // use subscript operator rather than dot
      }
    } else {
      throw new IllegalArgumentException('only methods starting with findAllBy are accepted')
    }
  }
}
