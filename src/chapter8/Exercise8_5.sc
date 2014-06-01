class Point(val x:Double, val y:Double)

class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

new LabeledPoint("Black Thursday", 1929, 230.07)