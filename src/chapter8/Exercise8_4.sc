abstract class Item {
  def price:Double
  def description:String

  override def toString: String = s"$description : $price"
}
class SimpleItem(override val price:Double, override val description: String) extends Item
class Bundle extends Item {
  var items:List[Item] = List()

  def addItem(item: Item) = items = item :: items

  def price: Double = items.map(_.price).sum

  def description: String = items.map(_.description).mkString(" + ")
}

val item: SimpleItem = new SimpleItem(100, "Potato")
val bundle: Bundle = new Bundle
bundle.addItem(item)
bundle.addItem(item)
println(bundle)
