package sample

trait Printable[A] {
  def format(a: A): String
}
object Printable {
  def format[A](a: A)(implicit printable: Printable[A]): String = printable.format(a)

  // $COVERAGE-OFF$Fuck println
  def print[A](a: A)(implicit printable: Printable[A]): Unit = println(format(a))
  // $COVERAGE-ON$
}

object PrintableInstances {
  implicit val stringPrintable = new Printable[String] {
    def format(a: String): String = a
  }

  implicit val intPrintable = new Printable[Int] {
    def format(a: Int): String = a.toString
  }
}
