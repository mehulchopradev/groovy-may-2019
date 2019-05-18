// a user defined exception
//ideally
// 1. Always check for the java api for the built in exception that can be used in ur scenario
// 2. If not, then create ur own exception class
class IllegalShapeException extends Exception {
  IllegalShapeException(message) {
    super(message);
  }
}
