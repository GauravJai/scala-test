package com.cart

object ShoppingCart {

  def calculateTotalCost(items: List[String]): Double = {
    val apple = 0.60
    val orange = 0.25
    val banana = 0.20
    val bananaPrice = banana * buyOneGetOneBanana(items.count(_ == "Banana"))
    val applePrice = apple * buyOneGetOneApple(items.count(_ == "Apple"))
    val orangePrice = orange * threeForTwoOrange(items.count(_ == "Orange"))

    if (applePrice > bananaPrice) {
      applePrice + orangePrice
    } else {
      bananaPrice + orangePrice
    }
  }

  def buyOneGetOneApple(apples: Int): Int = {
    apples / 2 + apples % 2
  }

  def threeForTwoOrange(oranges: Int): Int = {
    oranges - (oranges / 3)
  }

  def buyOneGetOneBanana(banana: Int): Int = {
    banana / 2 + banana % 2
  }

}
