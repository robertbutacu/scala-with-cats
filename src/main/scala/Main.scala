import printable.library.{Cat, Printable}
import printable.library.PrintableInstances._
import printable.library.PrintableSyntax._

object Main extends App {
  val sophie = Cat("Sophie", 15, "red")

  sophie.print

  Printable.print(sophie)
}
