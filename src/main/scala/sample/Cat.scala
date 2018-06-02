package sample

final case class Cat(name: String, age: Int, color: String)

object CatInstances {
  implicit val catFormat = new Printable[Cat] {
    def format(a: Cat): String = {
      import PrintableInstances._

      val name: String = Printable.format(a.name)
      val age: String = Printable.format(a.age)
      val color: String = Printable.format(a.color)

      s"$name is a $age year-old $color cat"
    }
  }
}
