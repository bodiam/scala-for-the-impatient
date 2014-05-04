
/**
 * @author Erik Pragt
 */

class Employee(val name:String, var salary:Double) {
  def this() {
    this("John Q. Public", 0.0)
  }
}



class EmployeeExplicit {
  private var _salary = 0.0

  private var _name: String = ""

  def this(name: String, salary:Double) {
    this()
    this._name = name
    this._salary = salary
  }

  def name = _name
}

def e = new EmployeeExplicit("Erik", 1000)