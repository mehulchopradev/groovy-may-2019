package com.example.college.domain

import com.example.college.domain.common.Address
import com.example.util.DataType

// google.com
// com -> google -> application specific

// OOP
// 1. visualize real world actors as something that occupies memory in the ram
// Objects

// 2. Student with his/her characteristics -> Each object must have its own set of attributes
// same attributes, but with their own values

// 3. Actions that we do on a student -> Methods to be called on an object

// data in the memory has a data type
// student object -> Student (convention user defined data type must be capital case)
// class (give a data type to all objects created from a class) - blueprint for an object

// Person X
// an object of the class 'java.lang.Class' is created for the Student class
// sub class / child class / concrete class
class Student extends CollegeUser implements DataType {
  // by convention the name of the file and the name of the class must be the same (case sensitive)
  // one file can have more than one class
  // it is advised to have one class per file

  // object properties (attributes)
  // as a convention, while declaring attributes in a class, consider using static typing
  // instance variables (properties of an object)
  // default value of all instance variables is null
  // null -> reference variable without any address that it is storing a reference of
  // String name
  // Character gender
  Integer roll
  Float marks

  //compositon association
  Address address

  // class properties
  static Integer count = 0 // it will be stored in the Class object of Student
  // shared by all the objects of Student


  // constructors
  // has the same name as the class
  // has to be called with new (at the time of object creation)
  // no explicit return (default return the object)
  // no def while defining constructor
  // default
  /* Student(Student this) {

  } */

  // constructor overloading
  Student() {
    // this.count++ // this works, but is confusing
    Student.count++ // ideal way. Access (get/set) using class name
  }

  // parameterized constructor
  // you declare a constructor, u do not get the default constructor
  Student(String name, Character gender, Integer roll, Float marks, Address address = null) {
    // initializing the properties of an object
    this.name = name

    // from within the class, the property access does not automatically
    // go through the setter and getter functions (the way it does from outside the class)
    this.setGender(gender)

    this.roll = roll
    this.marks = marks
    this.address = address

    Student.count++
  }

  def getDetails() {
    // println this // reference of the current object for which the function is called
    def part1 = "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
    // "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}" -> will also work
    // as the lower level code will put this before every attribute name
    /* def part2 = ''
    if (this.address) {
      part2 = '\n' + this.address.getDetails()
    } */

    def part2 = '\n' + (this.address?.getDetails() ?: 'NA') // ?. safe navigation operator

    part1 + part2
  }

  // internally
  /*
  def getDetails(Student this) {

  }
  */

  // instance function
  def getGrade() {
    switch (this.marks) {
      // range data can be used in case, since it supports casing
      // NumberRange in order to support Float marks
      case new NumberRange(70, 100): 'A'
        break
      case new NumberRange(60, 69): 'B'
        break
      case new NumberRange(40, 59): 'C'
        break
      case new NumberRange(0, 39): 'F'
        break
      default: 'I'
    }
  }

  // static function
  static def getMandatoryAttendance() {
    // there is no "this"
    // in a static function u will never access the attributes of an object (u can't)
    70.0
  }

  // automatically getter/setter functions for each of the properties (instance/static) declared in the class,
  // are created
  // GroovyBean

  // for custom setter and getter logic
  // encapsulation
  // on demand encapsulation
  def setGender(gender) {
    if (gender == 'm' || gender == 'f') {
      this.gender = gender
    } else {
      this.gender = null
    }
  }
}
