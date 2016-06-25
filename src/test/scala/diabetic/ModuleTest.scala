package diabetic

import org.scalatest.{FlatSpec, ShouldMatchers}

class ModuleTest extends FlatSpec with ShouldMatchers {

  "Module" should "have a nice string conversion" in {
    Module.toString shouldBe "Module"
  }

  it should "be serializable" in {
    Module shouldBe a [Serializable]
  }

  it should "be a product" in {
    Module.productPrefix shouldBe "Module"
    Module.productArity shouldBe 0
    Module.productIterator shouldBe 'empty
  }
}
