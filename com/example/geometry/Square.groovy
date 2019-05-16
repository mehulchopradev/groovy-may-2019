package com.example.geometry

class Square extends Shape {
  Float side

  def area() {
    this.side * this.side
  }

  def perimeter() {
    4 * this.side
  }
}
