package models

class Movie (
    var movieId: Int,
            var movieName: String,
            var movieGenre: String,
            var isWatched: Boolean,
            var lengthInMinutes: Int
)

{
    override fun toString(): String {
        return "Movies: '$movieName'is the name of the movie and its genre is '$movieGenre'"
    }
}