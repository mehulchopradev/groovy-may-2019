package com.example.geometry

import com.example.util.DataType

class Square extends Shape implements DataType {
  Float side

  def area() {
    this.side * this.side
  }

  def perimeter() {
    4 * this.side
  }
}
