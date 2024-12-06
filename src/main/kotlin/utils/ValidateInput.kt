package utils

    fun readValidGenre(prompt: String?): String {
        var input = readNextLine(prompt)
        do {
            if (isValidGenre(input)) {
                return input
            } else {
                print("Invalid category $input.  Please try again: ")
                input = readNextLine(prompt)
            }
        } while (true)
    }
