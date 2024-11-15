
import utils.readNextInt

fun main() : Int {
    println("""
       / Movie App \
       -------------
      1) Add a movie
      2) Add an actor
      3) Assign an actor to a movie
      4) List the movies
      5) List the actors
      6) Search for a movie
      7) Search for an Actor
      8) Show movie with specific actor
      9) Show all actors in a specific movie
      10) Show movies in certain genre
    """.trimIndent())
    return readNextInt(" > ==>>")

}