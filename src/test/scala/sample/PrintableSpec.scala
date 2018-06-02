package sample

import org.scalatest.{WordSpec, MustMatchers}

import PrintableInstances._

class PrintableSpec extends WordSpec with MustMatchers {
  "printable" must {
    "format a string" in {
      Printable.format("a") must be("a")
    }

    "format a int" in {
      Printable.format(1) must be("1")
    }
  }
}
