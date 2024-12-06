package models

class MovieActor (
    var movieId: Int,
            var actorId: Int
    )

{
    override fun toString(): String {
        return "MovieActor(movieId=$movieId, actorId=$actorId)"
    }
}