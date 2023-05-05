package com.cart

import com.cart.ShoppingCart
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartSpecs extends AnyFlatSpec with Matchers {

  "calculateTotalCost" should "return total cost of items" in {
    val itemList = List("Apple", "Apple", "Orange", "Apple")
    val totalCost = ShoppingCart.calculateTotalCost(itemList)

    totalCost shouldEqual 2.05
  }

}
