package models

class Actor (
    var actorId: Int,
            var actorName: String,
                    var actorAge: String,
                            var actorNationality: String,
                            var actorAwards: String
)
{
    override fun toString(): String {
        return "Actors:'$actorName' ('$actorAge'), is '$actorNationality' and his awards are:'$actorAwards')"
    }
}