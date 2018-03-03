package monoids.semigroups

trait SemigroupB[A] {
  def combine(x: A, y: A): A
}
trait MonoidB[A] extends SemigroupB[A] {
  def empty: A
}
object MonoidB {
  def apply[A](implicit monoid: MonoidB[A]) =
    monoid

  implicit val implicitAndBoolean: MonoidB[Boolean] = new MonoidB[Boolean] {
    override def empty: Boolean = true

    override def combine(x: Boolean, y: Boolean): Boolean = x && y
  }

  implicit val implicitOrBoolean: MonoidB[Boolean] = new MonoidB[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = x || y
  }

  implicit val implicitEitherBoolean: MonoidB[Boolean] = new MonoidB[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = (x && !y) || (!x && y)
  }

  implicit val implicitNorBoolean: MonoidB[Boolean] = new MonoidB[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = (!x || y) && (x || !y)
  }

  implicit def implicitSetMonoid[A]: MonoidB[Set[A]] = new MonoidB[Set[A]] {
    override def empty: Set[A] = Set.empty

    override def combine(x: Set[A], y: Set[A]): Set[A] = x union y
  }
}

