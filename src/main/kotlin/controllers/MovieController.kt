package controllers

import models.Movie

class MovieController {
    private val movies = mutableListOf<Movie>()
    private var lastId = 0
    private fun getId() = lastId++

    fun addMovie(movie: Movie) {
        movie.movieId = getId()
        movies.add(movie)
    }

    fun listMovies() = movies
}