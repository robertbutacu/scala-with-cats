import printable.library.{Cat, Printable}
import printable.library.PrintableInstances._

object Main extends App {
  val sophie = Cat("Sophie", 15, "red")

  Printable.print(sophie)
}
