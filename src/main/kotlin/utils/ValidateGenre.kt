package utils

    // Using this to list the types of Genres
    val genres = setOf("Action", "Horror", "Comedy", "Drama", "Romance")

    fun isValidGenre(genreToCheck: String?): Boolean {
        for (genre in genres) {
            if (genre.equals(genreToCheck, ignoreCase = true)) {
                return true
            }
        }
        return false
    }
