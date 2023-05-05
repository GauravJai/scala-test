package com.cart

object ShoppingCart {

  def calculateTotalCost(items: List[String]): Double = {
    val apple = 0.60
    val orange = 0.25

    val totalCost = apple * items.count(_ == "Apple") + orange * items.count(_ == "Orange")

    totalCost
  }

}
