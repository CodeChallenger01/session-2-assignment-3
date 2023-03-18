import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ClassHierarchyTest extends AnyFlatSpec with Matchers {
  val drivenOnly = new Car
  val sailedOnly = new Boat
  val flownOnly = new Aeroplane
  val flyingCar = new FlyingCar
  val hoverCraft = new Hovercraft

  //Test Case for Driven Vehicle gives Positive Result
  "DrivenCar" should "match with it is driven" in {
    val result = drivenOnly.move
    result shouldBe "Car can be driven"
  }

  //Test Case for Driven Vehicle gives Negative Result
  "DrivenCar" should "not match with it is sailed" in {
    val result = drivenOnly.move
    assert(result != "Car can  be sailed")
  }

  //Test Case for Sailed Vehicle gives Positive Result
  "Boat" should "match with it is sailed" in {
    val result = sailedOnly.move
    result shouldBe "Boat can be sailed"
  }

  //Test Case for Sailed Vehicle gives Negative Result
  "Boat" should "not match with it is driven" in {
    val result = sailedOnly.move
    assert(result != "Boat can be driven")
  }

  //Test Case for Flyable Vehicle gives Positive Result
  "Aeroplane" should "match with it is flown" in {
    val result = flownOnly.move
    result shouldBe "Aeroplane can be flown"
  }

  //Test Case for Flyable Vehicle gives Negative Result
  "Aeroplane" should "not match with it is sailed" in {
    val result = flownOnly.move
    assert(result != "Aeroplane can be sailed")
  }

  //Test Case for both Drivable and Flyable gives Positive Result
  "FlyingCar" should "match with it is flown and driven" in {
    val result = flyingCar.move
    result shouldBe "Flying Car can be driven and flown"
  }

  //Test Case for both Drivable and Flyable gives Negative Result
  "FlyingCar" should "not match with it is sailed" in {
    val result = flyingCar.move
    assert(result != "Flying Car can be sailed")
  }

  //Test Case for both Drivable and Sailable gives Positive Result
  "Hovercraft" should "match with it is sailed and driven" in {
    val result = hoverCraft.move
    result shouldBe "Hovercraft can be sailed and driven"
  }
  //Test Case for both Drivable and Sailable gives Negative Result
  "Hovercraft" should "not match with it is flown" in {
    val result = hoverCraft.move
    assert(result != "Hovercraft can be flown")
  }
}
