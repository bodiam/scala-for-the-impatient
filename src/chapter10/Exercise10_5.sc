import java.awt.Point
import java.beans.{PropertyChangeListener, PropertyChangeEvent, PropertyChangeSupport}

trait PropertyChangeSupportTrait { self =>
  private val support = new PropertyChangeSupport(self)

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = support.addPropertyChangeListener(listener)

  def removePropertyChangeListener(listener: PropertyChangeListener): Unit = support.removePropertyChangeListener(listener)

  def getPropertyChangeListeners: Array[PropertyChangeListener] = support.getPropertyChangeListeners

  def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = support.addPropertyChangeListener(propertyName, listener)

  def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = support.removePropertyChangeListener(propertyName, listener)

  def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = support.getPropertyChangeListeners(propertyName)

  def firePropertyChange(propertyName: String, oldValue: scala.Any, newValue: scala.Any): Unit = support.firePropertyChange(propertyName, oldValue, newValue)

  def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit = support.firePropertyChange(propertyName, oldValue, newValue)

  def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit = support.firePropertyChange(propertyName, oldValue, newValue)

  def firePropertyChange(event: PropertyChangeEvent): Unit = support.firePropertyChange(event)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: scala.Any, newValue: scala.Any): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean): Unit = support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)

  def hasListeners(propertyName: String): Boolean = support.hasListeners(propertyName)
}


class BeansPoint(x: Int, y: Int) extends java.awt.Point(x, y) with PropertyChangeSupportTrait {
  def this() = this(0, 0)

  override def setLocation(p: Point): Unit = {
    firePropertyChange("location", this.getLocation, p)
    super.setLocation(p)
  }
}

val p = new BeansPoint()

object PCL extends java.beans.PropertyChangeListener {
  override def propertyChange(pce:java.beans.PropertyChangeEvent):Unit = {
    println(s"Bean changed its ${pce.getPropertyName} from ${pce.getOldValue} to ${pce.getNewValue}")
  }
}

p.addPropertyChangeListener(PCL)
p.setLocation(new Point(10, 20))

