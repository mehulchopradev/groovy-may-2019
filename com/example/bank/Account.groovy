package com.example.bank

class Account {
  String name
  String type
  Double balance

  def withdraw(Double amt) {
    println "Transaction starts.."

    try {
      if (amt < 0) {
        throw new IllegalArgumentException('Amount cannot be negative')
      }
      if (this.balance - amt < 1000) {
        throw new IllegalStateException('Cannot go below 1000')
      }
      this.balance -= amt
      this.balance
    } finally {
      // will always execute irrespective of whatever happens in the corresponding try block
      println "Transaction ends.."
    }
  }

  def plus(def amt) {
    this.balance += amt
  }
}
