package printable.library

import cats.{Eq, Show}
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

final case class Cat(name: String, age: Int, color: String)

object Cat {
  implicit val catShow: Show[Cat] = Show.show[Cat] { cat =>
    val name = cat.name.show
    val age = cat.age.show
    val color = cat.color.show
    s"$name is a $age year-old $color cat."
  }

  implicit val catsEq: Eq[Cat] = Eq.instance[Cat] { (cat1, cat2) => cat1.name == cat2.name}
}
