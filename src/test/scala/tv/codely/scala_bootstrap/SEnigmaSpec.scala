package tv.codely.scala_bootstrap

import org.scalatest._
import org.scalatest.Matchers._

final class SEnigmaSpec extends WordSpec {

  "SEnigmaSpec" should {
    val map = Map(23 -> 'N', 234 -> ' ', 89 -> 'H', 78 -> 'Q', 37 -> 'A')
    val deciphe = SEnigma.deciphe(map) _

    "(2,3) is 'N'" in {
      deciphe(List(2, 3)) shouldBe "N"
    }
    "(2,3,8,9) is 'NH'" in {
      deciphe(List(2, 3, 8, 9)) shouldBe "NH"
    }

    "(1,2,3) is '1N'" in {
      deciphe(List(1, 2, 3)) shouldBe "1N"
    }

    "(2,3,4) is ' '" in {
      deciphe(List(2, 3, 4)) shouldBe " "
    }

    "(1,2,3,7,3,2,3,7,2,3,4,8,9,7,8) is '1N73N7 HQ'" in {
      deciphe(List(1, 2, 3, 7, 3, 2, 3, 7, 2, 3, 4, 8, 9, 7, 8)) shouldBe "1N73N7 HQ"
    }
  }
}
