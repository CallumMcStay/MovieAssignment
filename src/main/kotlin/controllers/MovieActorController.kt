package controllers

import models.MovieActor

class MovieActorController {

    private val movieActors = mutableListOf<MovieActor>()

    fun addActorToMovie(actorId: Int, movieId: Int) {
        movieActors.add(MovieActor(actorId, movieId))
    }

    fun listActorsInMovie(movieId: Int) = movieActors.filter {it.movieId == movieId}
}