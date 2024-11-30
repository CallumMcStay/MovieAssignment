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

    fun myMovies(): List<String> {
        return listOf("Star Wars", "Batman", "Spider-Man", "Pirates of The Carribean")
    }

    fun listMoviesByGenre() {

    }
}
