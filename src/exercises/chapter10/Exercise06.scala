package exercises.chapter10

/**
  * In the Java AWT library, we have a class Container, a subclass of Component that collects multiple components.
  * For example, a Button is a Component, but a panel is a Container. That's the composite pattern at work.
  * Swing has JComponent and JButton, but if you look closely, you will notice something strange.
  * JComponent extends Container, even though it makes no sense to add other components to, say, a JButton.
  * Ideally, the Swing designers would have preferred the design in figure 10-4.
  *
  * But that's not possible in Java. Explain why not. How could the design be executed in Scala with traits?
  */
object Exercise06 {

  /**
    * But that's not possible in Java. Explain why not.
    *     Java does not support multiple inheritance.
    *
    *  How could the design be executed in Scala with traits?
    *     Reimplement Component as a trait.
    */
}
