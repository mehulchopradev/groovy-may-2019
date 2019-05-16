package com.example.college.domain

// super class / parent class / base class
// multilevel inheritance Professor -> CollegeUser -> Object
// single inheritance CollegeUser -> Object
class CollegeUser { // extends Object (implicitly inherits)
  String name
  Character gender

  // a final method cannot be overriden in any of its subclass
  // though a final method continues to be inherited in its subclass
  final def giveAttendance() {
    println "Finger print software"
  }

  def getDetails() {
    // 'this' -> Address of the Professor object
    // 'this' -> Address of the CollegeStudent object
    // in general -> 'this' can be an address of any of the subclass object of CollegeUser
    "Name: ${this.name}\nGender: ${this.gender}"
  }
}
