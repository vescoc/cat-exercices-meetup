package sample

import org.scalatest.{WordSpec, MustMatchers}

import CatInstances._
import cats._
import cats.implicits._

class CatSpec extends WordSpec with MustMatchers {
  "printable" must {
    "format a cat" in {
      Printable.format(Cat("a", 1, "red")) must be("a is a 1 year-old red cat")
    }
  }

  "show" must {
    "show a cat" in {
      Cat("a", 1, "red").show must be("a is a 1 year-old red cat")
    }
  }
}
