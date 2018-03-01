import printable.library.Cat
import printable.library.Cat.catShow
import cats.syntax.eq._

object Main extends App {
  val sophie: Cat = Cat("Sophie", 15, "red")
  val eva: Cat = Cat("Eva", 10, "blue")

  println(sophie === eva)
  println(sophie === sophie)
}
