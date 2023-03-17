import scala.util.{Failure, Success, Try}

//trait of type Vehicle with abstract method
trait Vehicle {
  def move: String
}

/*
Define three more trait for different different behaviour and functionality
1-->Drivable Vehicle
2-->Sailable Vehicle
3-->Flyable Vehicle
 */
trait Drivable {
  def driven: String = "driven"
}

trait Sailable {
  def sail: String = "sailed"
}

trait Flyable {
  def flown: String = "flown"
}

//Car class Extended the Vehicle trait with Drivable trait
class Car extends Vehicle with Drivable {
  def move: String = s"Car can be $driven"
}

//Boat class Extended the Vehicle trait with Sailable trait
class Boat extends Vehicle with Sailable {
  def move: String = s"Boat can be $sail"
}

//Aeroplane class Extended the Vehicle trait with Flyable trait
class Aeroplane extends Vehicle with Flyable {
  def move: String = s"Aeroplane can be $flown"
}

//Flying Car class Extended the Vehicle class with Drivable and Flyable trait
class FlyingCar extends Vehicle with Drivable with Flyable {
  def move: String = s"Flying Car can be $driven and $flown"
}

//Hovercraft class Extended the Vehicle trait with Sailable and Drivable trait
class Hovercraft extends Vehicle with Sailable with Drivable {
  def move: String = s"Hovercraft can be $sail and $driven"
}

// Singleton object main start from this object
object VehicleTrait extends App {
  val drivenOnly = new Car
  val sailedOnly = new Boat
  val flownOnly = new Aeroplane
  val flyingCar = new FlyingCar
  val hoverCraft = new Hovercraft

  // Try Catch to Handle the Exception
  var resultDriven = Try(drivenOnly.move)
  resultDriven match {
    case Success(resultDriven) => resultDriven
    case Failure(exception) => exception.getMessage
  }
  var resultSailed = Try(sailedOnly.move)
  resultSailed match {
    case Success(resultDriven) => resultSailed
    case Failure(exception) => exception.getMessage
  }
  var resultFlown = Try(flownOnly.move)
  resultFlown match {
    case Success(resultDriven) => resultFlown
    case Failure(exception) => exception.getMessage
  }
}

