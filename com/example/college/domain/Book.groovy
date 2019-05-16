package com.example.college.domain

class Book {
  // for each of the final properties, there is no set function in the groovy bean
  final String title
  final Integer pages
  final Float price

  Book(Map params) {
    this.title = params['title']
    this.pages = params['pages']
    this.price = params['price']
  }
}
