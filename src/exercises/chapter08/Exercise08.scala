package exercises.chapter08

/**
  * 8. Compile the Person and SecretAgent classes in Section 8.6, “Overriding Fields,”
  *    on page 91 and analyze the class files with javap. How many name fields are
  *    there? How many name getter methods are there? What do they get? (Hint:
  *    Use the -c and -private options.)
  */
object Exercise08 {


  /**
    * Compiled from "Exercise08.scala"
    *
    * public class exercises.chapter08.Exercise08$Person {
    *   private final java.lang.String name;
    *   public java.lang.String name();
    *   public java.lang.String toString();
    *   public exercises.chapter08.Exercise08$Person(java.lang.String);
    * }
    */
  class Person(val name: String) {
    override def toString = getClass.getName + "[name=" + name + "]"
  }

  /**
    * Compiled from "Exercise08.scala"
    *
    * public class exercises.chapter08.Exercise08$SecretAgent extends exercises.chapter08.Exercise08$Person {
    *   private final java.lang.String name;
    *   private final java.lang.String toString;
    *   public java.lang.String name();
    *   public java.lang.String toString();
    *   public exercises.chapter08.Exercise08$SecretAgent(java.lang.String);
    * }
    */
  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret" // Don’t want to reveal name . . .
    override val toString = "secret" // . . . or class name
  }

}
