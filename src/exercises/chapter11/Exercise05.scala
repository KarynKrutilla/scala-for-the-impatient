package exercises.chapter11

/**
  * Provide operators that construct and HTML table. For example.
  *
  *   Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  *
  * should produce
  *
  *   <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling....
  *
  */
object Exercise05 extends App {

  private var segments = ""

  class Table {
    def |(segment:String) = {
      segments += "<td>%s</td>".format(segment)
      this
    }

    def ||(segment:String) = {
      segments += "</tr><tr><td>%s</td>".format(segment)
      this
    }

    override def toString: String = {
      "<table><tr>%s</tr></table>".format(segments)
    }
  }

  object Table {
    def apply() = new Table()
  }

  val output = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  print(output.toString)
  assert(output.toString == "<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM, .NET</td></tr></table>")
}
