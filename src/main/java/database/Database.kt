package database

import models.Message
import models.Profile
import java.util.*
import kotlin.collections.HashMap

object Database {
    val _messages = HashMap<Long, Message>()
    val messages: HashMap<Long, Message>
        get() = _messages

    private val _profiles = HashMap<Long, Profile>()
    val profiles: HashMap<Long, Profile>
        get() = _profiles

}

