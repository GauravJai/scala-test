package com.cart

object ShoppingCart {

  def calculateTotalCost(items: List[String]): Double = {
    val apple = 0.60
    val orange = 0.25
    apple * buyOneGetOneApple(items.count(_ == "Apple"))
      + orange * threeForTwoOrange(items.count(_ == "Orange"))
  }

  def buyOneGetOneApple(apples: Int): Int = {
    apples / 2 + apples % 2
  }

  def threeForTwoOrange(oranges: Int): Int = {
    oranges - (oranges / 3)
  }

  def buyOneGetOneBanana(banana: Int): Int = {
     0
  }

}
