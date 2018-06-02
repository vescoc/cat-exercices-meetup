package sample

import org.scalatest.{WordSpec, MustMatchers}

import CatInstances._

class CatSpec extends WordSpec with MustMatchers {
  "printable" must {
    "format a cat" in {
      Printable.format(Cat("a", 1, "red")) must be("a is a 1 year-old red cat")
    }
  }
}
