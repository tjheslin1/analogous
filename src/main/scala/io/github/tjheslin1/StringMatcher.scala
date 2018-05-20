package io.github.tjheslin1

object StringMatcher {

  def matcher = "one23four".toSeq match {
    case Seq('o', 'n', 'e', x, '3', 'f', 'o', 'u', 'r') => println("Match! " + x)
    case _ => println("No match!")
  }


}
