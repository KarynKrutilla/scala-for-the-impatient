package exercises.chapter10

import java.beans.{PropertyChangeListener, PropertyChangeSupport}

/**
  * The JavaBeans specification has the notion of a property change listener,
  * a standardized way for beans to communicate changes in their properties.
  * The PropertyChangeSupport class is provided as a convenience superclass for any bean
  * that wishes to support property change listeners.
  * Unfortunately, a class that already has another superclass-such as JComponent-must reimplement the methods.
  * Reimplement PropertyChangeSupport as a trait, and mix it into the java.awt.Point class.
  */
object Exercise05 {

  // Reimplement PropertyChangeSupport as a trait
  trait PropertyChangeSupportTrait extends App {
    val property = new PropertyChangeSupport(this)

    def addPropertyChangeListener(listener:PropertyChangeListener) = property.addPropertyChangeListener(listener)
    def removePropertyChangeListener(listener:PropertyChangeListener) = property.removePropertyChangeListener(listener)
    def firePropertyChange(propertyName:String, oldValue:Object, newValue:Object) = property.firePropertyChange(propertyName, oldValue, newValue)
    def fireIndexedPropertyChange(propertyName:String, index:Int, oldValue:Object, newValue:Object) =  property.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  }

  // Mix it into the java.awt.Point class
  class PointWithPropertyChangeSupportTrait(x: Int, y: Int) extends java.awt.Point(x, y) with PropertyChangeSupportTrait{

  }

  val point = new PointWithPropertyChangeSupportTrait(5,5)
}
