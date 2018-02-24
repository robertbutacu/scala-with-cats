package printable.library

object PrintableInstances {
  implicit val printableString: Printable[String] = (value: String) => value

  implicit val printableInt: Printable[Int] = (value: Int) => value.toString

  implicit val printableCat: Printable[Cat] = { (value: Cat) =>
    lazy val formattedName = Printable.format(value.name)

    lazy val formattedAge = Printable.format(value.age)

    lazy val formattedColor = Printable.format(value.color)

    s"""$formattedName is a $formattedAge year-old $formattedColor cat."""
  }
}
