import scala.collection.mutable.ArrayBuffer

/*Provide operators that construct an HTML table. For example,
Click here to view code image
  Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
should produce
  Click here to view code image
  <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
    */

class Table {
  private val buffer = ArrayBuffer[String]()

  def |(value:String) = {
    buffer += s"<td>$value</td>"
    this
  }

  def ||(value:String) = {
    buffer += s"</tr>\n<tr><td>$value</td>"
    this

  }

  override def toString = "<table><tr>\n%s</tr></table>".format(buffer.mkString)
}

object Table {
  def apply() = {
    new Table()
  }
}



Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | ".NET"