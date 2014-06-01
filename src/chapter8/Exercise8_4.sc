
abstract class Item {
  def price(): Double

  def description(): String
}

class SimpleItem(override val price: Double, override val description: String) extends Item


class Bundle extends Item {

  private var items: List[Item] = List()

  def addItem(item: Item) = {
    items = item :: items
  }

  override def price(): Double = items.map(_.price()).sum

  override def description(): String = items.map(_.description()).mkString(",")
}


val bundle: Bundle = new Bundle()
bundle.addItem(new SimpleItem(100, "Sweater"))
bundle.addItem(new SimpleItem(20, "Socks"))
bundle.addItem(new SimpleItem(20, "Socks"))
bundle.price()
bundle.description()