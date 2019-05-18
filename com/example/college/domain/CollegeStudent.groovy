package com.example.college.domain

import com.example.college.domain.common.Address
import com.example.util.DataType

// single inheritance
class CollegeStudent extends CollegeUser implements DataType {
  Integer roll
  Float marks

  //compositon association
  Address address

  // method overriding
  // for a valid override, the method signature must be the same
  def getDetails() {
    def part1 = super.getDetails()

    // own implementation
    "${part1}\nRoll: ${this.roll}\nMarks: ${this.marks}"
  }
}
