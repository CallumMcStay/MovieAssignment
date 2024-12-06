import controllers.ActorController
import controllers.MovieController
import controllers.MovieActorController
import models.Movie
import models.Actor
import utils.*
import utils.readValidGenre


val actorController = ActorController()
val movieController = MovieController()
val movieActorController = MovieActorController()

fun main() {

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
      6) List the Actors in Movies
      7) My Favourite Movies
      8) List Movies by Genre
      9) List Movies Not Watched
      0) Exit
    """.trimMargin("|")
        )


        when (choice) {
            1 -> {
              addActor()
            }

            2 -> {
                addMovie()
            }

            3 -> {
                assignActorToMovie()
            }

            4 -> {
                listOfActors()
            }

            5 -> {
                   listOfMovies()
                }

            6 -> {
               actorsInMovies()
            }

            7 ->{
                myFavMovies()

            }

            8->{
           listMoviesByGenre()
            }

            9->{
                listMoviesNotWatched()
            }

            0 -> {
                println("Exiting...")
            }



else -> println("Invalid choice: $choice. Please try again.")
        }
    }while (choice != 0)
}


fun addActor() {
    //Add Actor
    var actorName = readNextLine("Name: ")
    var actorAge = readNextLine("Age: ")
    var actorNationality = readNextLine("Nationality: ")
    var actorAwards = readNextLine("Awards: ")
    val actor = Actor(0, actorName, actorAge, actorNationality, actorAwards)
    actorController.addActor(actor)
}

fun addMovie() {
    //Add Movie
    val movieName = readNextLine("Movie Name: ")
    val movieGenre = readNextLine("Movie Genre: ")
    val lengthInMinutes = readNextInt("Length: ")
    var isWatched = false
    val movie = Movie(0, movieName, movieGenre, isWatched, lengthInMinutes)
    movieController.addMovie(movie)
}

fun assignActorToMovie() {
    val actorId = readNextInt("Enter actor id: ")
    val movieId = readNextInt("Enter movie id: ")
    movieActorController.addActorToMovie(movieId, actorId)
}

fun listOfActors() {
    //List of Actors
    println("Actors: \n${actorController.listActors()}")
}

fun listOfMovies() {
    //list of movies
    println("Movies: \n${movieController.listMovies()}")
}

fun actorsInMovies() {
    //List Actors in Movie
    val movieId = readNextInt("Enter Movie id: ")
    println(movieActorController.listActorsInMovie(movieId))
}

fun myFavMovies() {
    println("My favourite movies: \n${movieController.myMovies().forEach { println(it) }}")
}

fun listMoviesByGenre() {
    //List movies by genre
    val movieGenre = readValidGenre("Enter a Genre to list the movies in it")
    println(movieGenre)
    println(movieController.listMoviesByGenre(movieGenre))
}


fun listMoviesNotWatched() {
    println("The movies you whavent watched are: \n${movieController.listMoviesNotWatched()}")
    }
