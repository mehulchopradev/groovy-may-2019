package com.example.college.domain

// single inheritance
// a final class cannot be inherited further in any of the specialized classes
final class Professor extends CollegeUser {
  List subjects

  String toString() {
    this.getDetails()
  }

  def leftShift(subject) {
    this.subjects << subject
  }
}
