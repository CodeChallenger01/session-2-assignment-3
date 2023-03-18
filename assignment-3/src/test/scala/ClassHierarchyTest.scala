import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MainTest extends AnyFlatSpec with Matchers{
  val drivenOnly = new Car
  val sailedOnly =new Boat
  val flownOnly =new Aeroplane
  val flyingCar = new FlyingCar
  val hoverCraft = new Hovercraft

  //Test Case for Driven Vehicle
  "DrivenCar" should "match with it is driven" in{
    val result = drivenOnly.move
    result shouldBe "Car can be driven"
  }

  //Test Case for Sailed Vehicle
  "Boat" should "match with it is sailed" in{
    val result =sailedOnly.move
    result shouldBe "Boat can be sailed"
  }

  //Test Case for Flyable Vehicle
  "Aeroplane" should "match with it is flown" in {
    val result = flownOnly.move
    result shouldBe "Aeroplane can be flown"
  }

  //Test Case for both Drivable and Flyable
  "FlyingCar" should "match with it is flown and driven" in {
    val result = flyingCar.move
    result shouldBe "Flying Car can be driven and flown"
  }

  //Test Case for both Drivable and Sailable
  "Hovercraft" should "match with it is sailed and driven" in {
    val result = hoverCraft.move
    result shouldBe "Hovercraft can be sailed and driven"
  }
}
