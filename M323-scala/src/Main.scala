package ch.tbz

object Main {
  def calculateScore(word: String): Int = {
    var score = 0
    for (c <- word.toCharArray) {
      if (c != 'a') score += 1
    }
    score
  }


}