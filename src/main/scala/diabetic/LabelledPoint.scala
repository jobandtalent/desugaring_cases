package diabetic

class LabelledPoint(val label: String, val x: Int, val y: Int)
  extends Product3[String, Int, Int] with Serializable {

  override def productPrefix = "LabelledPoint"
  override def _1 = label
  override def _2 = x
  override def _3 = y

  def copy(label: String = this.label, x: Int = this.x, y: Int = this.y): LabelledPoint =
    new LabelledPoint(label, x, y)

  override def canEqual(that: Any) = that.isInstanceOf[LabelledPoint]

  override def equals(other: scala.Any): Boolean = other match {
    case that: LabelledPoint =>
      that.canEqual(this) && (this.label == that.label) && (this.x == that.x) && (this.y == that.y)
    case _ => false
  }

  override def hashCode(): Int =
    productIterator.foldLeft(0)((sum, field) => 31 * sum + field.hashCode())

  override def toString: String = productIterator.mkString(productPrefix + "(", ",", ")")
}

object LabelledPoint {
  def apply(label: String, x: Int, y: Int): LabelledPoint = new LabelledPoint(label, x, y)

  def unapply(value: LabelledPoint): Option[(String, Int, Int)] =
    Some(value.label, value.x, value.y)
}
