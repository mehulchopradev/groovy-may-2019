class Address {
  String country
  String state
  String city

  // default constructors
  /* Address() {

  } */

  // get this constructor always even when you define some other constructor in the class
  // the same rule does not apply for no-arg constructor
  /* Address(Map map) {
    this.country = map['country']
    this.state = map['state']
    this.city = map['city']
  } */

  def getDetails() {
    "Country: ${this.country}\nState: ${this.state}\nCity: ${this.city}"
  }
}
