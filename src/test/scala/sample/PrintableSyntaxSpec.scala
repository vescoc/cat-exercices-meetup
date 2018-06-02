package sample

import org.scalatest.{MustMatchers, WordSpec}

import CatInstances._
import PrintableSyntax._

class PrintableSyntaxSpec extends WordSpec with MustMatchers {
  "printable syntax" must {
    "format a string" in {
      Cat("a", 1, "red").format() must be("a is a 1 year-old red cat")
    }
  }
}
