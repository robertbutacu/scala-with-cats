package printable.library

object PrintableInstances {
  implicit val printableString: Printable[String] = (value: String) => value

  implicit val printableInt: Printable[Int] = (value: Int) => value.toString

  implicit val printableCat: Printable[Cat] = (value: Cat) =>
    s"""${value.name} is a ${value.age} year-old ${value.color} cat."""
}
