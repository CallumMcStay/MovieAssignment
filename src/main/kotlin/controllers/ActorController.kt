package controllers
import models.Actor

class ActorController {
    private val actors = mutableListOf<Actor>()
    private var lastId = 0
    private fun getId() = lastId++

    fun addActor(actor: Actor) {
        actor.actorId = getId()
        actors.add(actor)
    }

    fun listActors() = actors
}