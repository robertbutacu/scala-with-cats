import cats.Monoid
import printable.library.Cat
import printable.library.Cat.catShow
import cats.instances.list._
import cats.instances.int._
import cats.instances.option._
import cats.syntax.semigroup._
import cats.syntax.option._
import monoids.semigroups.Order
import monoids.semigroups.Order.orderAdditionMonoid

object Main extends App {

  def add[A: Monoid](l: List[A]): A = l.foldRight(Monoid[A].empty)((curr, acc) => curr |+| acc)

  println(add[Option[Int]](List(1.some,2.some,3.some,4.some,5.some, none)))

  println(Order(2.0, 3) |+| Order(4.0, 5))
}
