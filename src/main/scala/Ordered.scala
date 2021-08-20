trait  Ordered{
  def check(p: Person)

}
class Person(val name: String, val age: Int) extends Ordered {
  def check(p: Person) {

    if(this.name.equals(p.name))
      println("true")
    else
      println("false")
  }
  def second(p: Person) {

    if(this.age.equals(p.age))
      println("true")
    else
      println("false")
  }
}
object Oops {

  def main(args: Array[String]) {

    var p1 = new Person("Mayank", 28)
    var p2 = new Person("Mayank", 30)
    //  println(p1.name)
    p1.check(p2)
    p1.second(p2)


  }


}
