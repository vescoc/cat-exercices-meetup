package sample

object PrintableSyntax {
  implicit class PrintableOps[A](a: A) {
    def format(implicit printable: Printable[A]): String = Printable.format(a)

    // $COVERAGE-OFF$fuck println
    def print()(implicit printable: Printable[A]): Unit = Printable.print(a)
    // $COVERAGE-ON$
  }
}
