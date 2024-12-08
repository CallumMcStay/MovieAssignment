package controllers

import models.MovieActor

/**
 * Controller responsible for managing movie actors and their association with movies.
 *
 * This class allows for adding an actor to a movie and listing all actors associated
 * with a specific movie.
 */
class MovieActorController {

    // A mutable list to store the associations between movie actors and movies.
    private val movieActors = mutableListOf<MovieActor>()

    /**
     * Adds an actor to a movie by creating an association between the actor and the movie.
     *
     * @param actorId the ID of the actor to be added.
     * @param movieId the ID of the movie to which the actor is being added.
     */
    fun addActorToMovie(actorId: Int, movieId: Int) {
        movieActors.add(MovieActor(actorId, movieId))
    }

    /**
     * Lists all actors associated with a given movie.
     *
     * @param movieId the ID of the movie whose actors are to be listed.
     * @return a list of `MovieActor` objects representing the actors in the specified movie.
     */
    fun listActorsInMovie(movieId: Int) = movieActors.filter { it.movieId == movieId }
}
