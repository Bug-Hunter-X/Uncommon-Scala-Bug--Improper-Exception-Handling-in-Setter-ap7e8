```scala
import scala.util.{Try, Success, Failure}

class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    Try {
      if (newValue < 0) {
        throw new IllegalArgumentException("Value cannot be negative")
      }
      _value = newValue
    } match {
      case Success(_) => // Successful update
      case Failure(e: IllegalArgumentException) => println(s"Error setting value: ${e.getMessage}")
      case Failure(e) => println(s"An unexpected error occurred: ${e.getMessage}")
    }
  }
}

object Main extends App {
  val myObject = new MyClass("MyObject")
  myObject.value = 10
  println(myObject.value) // Output: 10

  myObject.value = -5
  //Output: Error setting value: Value cannot be negative
}
```