package printable.library

object PrintableInstances {
  implicit val printableString: Printable[String] = (value: String) => value

  implicit val printableInt: Printable[Int] = (value: Int) => value.toString
}
