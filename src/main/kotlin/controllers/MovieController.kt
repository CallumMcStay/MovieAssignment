package controllers

import models.Movie

/**
 * Controller responsible for managing movies.
 *
 * This class allows for adding movies, listing all movies, listing movies by genre,
 * and filtering movies that have not been watched.
 */
class MovieController {

    // A mutable list to store the movies in the system.
    private val movies = mutableListOf<Movie>()

    // Variable to keep track of the last movie ID generated.
    private var lastId = 0

    /**
     * Generates a unique movie ID by incrementing the last used ID.
     *
     * @return the next unique movie ID.
     */
    private fun getId() = lastId++

    /**
     * Adds a movie to the system.
     *
     * The movie's `movieId` is set automatically when added to the list.
     *
     * @param movie the movie to be added.
     */
    fun addMovie(movie: Movie) {
        movie.movieId = getId()
        movies.add(movie)
    }

    /**
     * Lists all movies in the system.
     *
     * @return a list of all movies in the system.
     */
    fun listMovies() = movies

    /**
     * Returns a static list of some predefined movies.
     *
     * @return a list of movie titles.
     */
    fun myMovies(): List<String> {
        return listOf("Star Wars", "Batman", "Spider-Man", "Pirates of The Carribean")
    }

    /**
     * Lists movies in the system filtered by the specified genre.
     *
     * If no movies exist or none match the genre, a message is returned.
     *
     * @param listGenre the genre to filter the movies by.
     * @return a string representing the movies filtered by the genre or a message
     *         if no movies are available or found in the specified genre.
     */
    fun listMoviesByGenre(listGenre: String) = {
        if (movies.isEmpty())
            "No Movies on the system"
        else
            movies.filter { it.movieGenre == listGenre }.toString()
    }

    /**
     * Lists movies in the system that have not been watched.
     *
     * If no movies are available or none have been marked as not watched,
     * a message is returned.
     *
     * @return a string representing the movies that have not been watched,
     *         or a message if no such movies exist.
     */
    fun listMoviesNotWatched () = {
        if (movies.isEmpty())
            "No Movies on the system"
        else
            movies.filter { !it.isWatched }.toString()
    }

}
