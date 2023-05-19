package com.cart

import com.cart.ShoppingCart
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartSpecs extends AnyFlatSpec with Matchers {

  "calculateTotalCost" should "return total cost of items" in {
    val itemList = List("Apple", "Apple", "Orange", "Apple")
    val totalCost = ShoppingCart.calculateTotalCost(itemList)
    totalCost shouldEqual 1.45
  }

  it should "return sum of the cost of most valued between apple and banana" in {
    val itemList = List("Apple", "Apple", "Banana", "Banana") // .60
    val cost = ShoppingCart.calculateTotalCost(itemList)
    cost shouldEqual .60
  }

  it should "return sum of the cost of most valued between apple and banana when both is equal priced" in {
    val itemList = List("Apple", "Banana", "Banana", "Banana", "Banana", "Banana") // .60
    val cost = ShoppingCart.calculateTotalCost(itemList)
    cost shouldEqual .60
  }

  "buyOneGetOneApple" should "return discounted count of apple to pay" in {
    val appleCount = ShoppingCart.buyOneGetOneApple(4)
    appleCount shouldEqual 2
  }

  it should "return correct discounted count when apples are not even in number" in {
    val appleCount = ShoppingCart.buyOneGetOneApple(3)
    appleCount shouldEqual 2
  }

  "threeForTwoOrange" should "return discounted count of oranges to pay" in {
    val appleCount = ShoppingCart.threeForTwoOrange(3)
    appleCount shouldEqual 2
  }

  it should "return correct discounted count when oranges are not multiple of three" in {
    val appleCount = ShoppingCart.threeForTwoOrange(4)
    appleCount shouldEqual 3
  }

  "buyOneGetOneBanana" should "return discounted count of banana" in {
    val bananaCount = ShoppingCart.buyOneGetOneBanana(3)
    bananaCount shouldEqual 2
  }

  it should "return discounted count of banana when total count is even" in {
    val bananaCount = ShoppingCart.buyOneGetOneBanana(4)
    bananaCount shouldEqual 2
  }

}
