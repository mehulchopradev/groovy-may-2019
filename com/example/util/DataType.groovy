package com.example.util

// specific to only groovy
// purpose is to be easly mixable (inheritable) in any of the classes without
// disturning or worrying about their inheritance structure
// a class can mixin from 1 or more than 1 traits (implements)

// this was to overcome the disadvantage of interfaces (prior to java 8)
trait DataType {
  def printType() {
    def c = this.getClass()
    println "Data type for this object is ${c}"
  }
}
