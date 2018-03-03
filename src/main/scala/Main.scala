import printable.library.Cat
import printable.library.Cat.catShow
import cats.syntax.eq._
import monoids.semigroups.Monoid
import monoids.semigroups.Monoid.implicitAndBoolean
import monoids.semigroups.Monoid.implicitSetMonoid

object Main extends App {
  val sophie: Cat = Cat("Sophie", 15, "red")
  val eva: Cat = Cat("Eva", 10, "blue")

  println(sophie === eva)
  println(sophie === sophie)

  println(Monoid[Boolean].combine(true, false))

  println(Monoid[Set[Int]].combine(Set(1, 2, 3), Set(4, 4, 5, 6)))
}
