import cats.Monoid
import printable.library.Cat
import printable.library.Cat.catShow
import cats.instances.list._
import cats.instances.int._
import cats.syntax.semigroup._

object Main extends App {

  def add[A: Monoid](l: List[A]): A = l.foldRight(Monoid[A].empty)((curr, acc) => curr |+| acc)

  println(add(List(1,2,3,4,5)))
}
