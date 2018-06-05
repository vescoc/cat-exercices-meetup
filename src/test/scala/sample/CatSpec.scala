package sample

import org.scalatest.{WordSpec, MustMatchers}

import CatInstances._
import cats.{Show, Eq}
import cats.instances.option._
import cats.syntax.show._
import cats.syntax.eq._

class CatSpec extends WordSpec with MustMatchers {
  // implicit prioritazation: cats > scalatest
  override def convertToEqualizer[T](left: T) = ???

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

  "eq" must {
    val cat1 = Cat("Garfield", 38, "orange and black")
    val cat2 = Cat("Heathcliff", 33, "orange and black")
    val optionCat1 = Option(cat1)
    val optionCat2 = Option.empty[Cat]

    "eq two equal cats" in {
      cat1 === cat1 must be(true)
    }

    "eq two different cats" in {
      cat1 === cat2 must be(false)
    }

    "not eq two different cats" in {
      cat1 =!= cat2 must be(true)
    }

    "eq two option different cat" in {
      optionCat1 === Option(cat1) must be(true)
    }

    "not eq two option different cat and empty" in {
      optionCat1 === optionCat2 must be(false)
    }
  }
}
