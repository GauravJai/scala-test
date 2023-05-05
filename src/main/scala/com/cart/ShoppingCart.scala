package com.cart

object ShoppingCart {

  def calculateTotalCost(items: List[String]): Double = {
    val apple = 0.60
    val orange = 0.25
    apple * items.count(_ == "Apple") + orange * items.count(_ == "Orange")
  }

  def buyOneGetOneApple(apples: Int): Int = {
      0
  }

  def threeForTwoOrange(oranges: Int): Int = {
    0
  }

}
