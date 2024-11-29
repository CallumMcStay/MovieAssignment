import controllers.ActorController
import controllers.MovieController
import controllers.MovieActorController
import utils.readNextInt
import models.Movie
import models.Actor
import utils.readNextLine
import utils.readNextInt

fun main() {
    val actorController = ActorController()
    val movieController = MovieController()
    val movieActorController = MovieActorController()


    var choice: Int

    do {
        choice = readNextInt(
            """
       / Movie App \
       -------------
      1) Add a Actor
      2) Add an Movie
      3) Assign an actor to a movie
      4) List the Actors
      5) List the Movies
      6) Search for a movie
      7) Search for an Actor
      8) Show movie with specific actor
      9) Show all actors in a specific movie
      10) Show movies in certain genre
    """.trimMargin("|")
        )


        when (choice) {
            1 -> {
                //Add Actor
                var actorName = readNextLine("Name: ")
                var actorAge = readNextLine("Age: ")
                var actorNationality = readNextLine("Nationality: ")
                var actorAwards = readNextLine("Awards: ")
                val actor = Actor(0, actorName, actorAge, actorNationality, actorAwards)
                actorController.addActor(actor)
            }

            2 -> {
                //Add Movie
                val movieName = readNextLine("Movie Name: ")
                val movieGenre = readNextLine("Movie Genre: ")
                val movie = Movie(0, movieName, movieGenre)
                movieController.addMovie(movie)
            }

            3 -> {
                val actorId = readNextInt("Enter actor id: ")
                val movieId = readNextInt("Enter movie id: ")
                movieActorController.addActorToMovie(movieId, actorId)
            }

            4 -> {
                //List of Actors
                println("Actors: \n${actorController.listActors()}")
            }

                5 -> {
                    //list of movies
                    println("Movies: \n${movieController.listMovies()}")
                }

            6 -> {
                //List Actors in Movie
                val movieId = readNextInt("Enter Movie id: ")
                println(movieActorController.listActorsInMovie(movieId))
            }
            0 -> {
                println("Exiting...")
            }



else -> println("Invalid choice: $choice. Please try again.")
        }
    }while (choice != 0)
}
