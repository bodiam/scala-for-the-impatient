/**
 * @author Erik Pragt
 */

import scala.language.implicitConversions

object Suits extends Enumeration {
  val Hearts = Value("♥")
  val Spades = Value("♠")
  val Diamonds = Value("♦")
  val Clubs = Value("♣")

  class SuitValue(suit: Value) {
    def isRed = !isBlack
    def isBlack = suit match {
      case Clubs | Spades => true
      case _              => false
    }
  }

  implicit def value2SuitValue(suit: Value) = new SuitValue(suit)
}

Suits.Hearts.isRed
Suits.Spades.isRed




