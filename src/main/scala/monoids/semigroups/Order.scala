package monoids.semigroups

import cats.{Monoid, Semigroup}

case class Order(totalCost: Double, quantity: Int)

object Order{
  implicit val orderAdditionMonoid: Monoid[Order] = new Monoid[Order] {
    override def empty: Order = Order(0.0, 0)

    override def combine(x: Order, y: Order): Order =
      Order(x.totalCost + y.totalCost, x.quantity + y.quantity)
  }

  implicit val orderSubtractionSemigroup: Semigroup[Order] =
    (x: Order, y: Order) =>
      Order(
        x.totalCost - y.totalCost,
        x.quantity - y.quantity
      )
}
