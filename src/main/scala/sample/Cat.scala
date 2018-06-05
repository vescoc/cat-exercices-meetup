package sample

final case class Cat(name: String, age: Int, color: String)

object CatInstances {
  implicit val catFormat = new Printable[Cat] {
    def format(a: Cat): String = {
      import PrintableInstances._

      val name = Printable.format(a.name)
      val age = Printable.format(a.age)
      val color = Printable.format(a.color)

      s"$name is a $age year-old $color cat"
    }
  }

  import cats._
  import cats.implicits._

  implicit val catShow = new Show[Cat] {
    def show(a: Cat): String = {

      val name = a.name.show
      val age = a.age.show
      val color = a.color.show

      s"$name is a $age year-old $color cat"
    }
  }

  implicit val catEq = Eq.instance[Cat] { (a, b) =>
    a.name === b.name &&
    a.age === b.age &&
    a.color === b.color
  }
}
