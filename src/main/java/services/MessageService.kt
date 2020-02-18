package services

import database.Database
import models.Message
import java.util.ArrayList

class MessageService() {

    var messages: HashMap<Long, Message> = Database.messages

    init {
        messages[0L] = Message(id = 0L, message = "This is the first message", author = "Me")
        messages[1L] = Message(id = 1L, message = "This is the second message", author = "Not Me")
    }

    fun getMessages(): List<Message> {
        return ArrayList<Message>(messages.values)
    }

    fun getMessage(id: Long): Message? {
        return messages[id]
    }

    fun addMessage(message: Message): Message? {
        message.id = messages.size + 1L
        messages[message.id] = message
        return message
    }

    fun updateMessage(message: Message): Message? {
        if (message.id < 0) return null
        messages[message.id] = message
        return message
    }

    fun removeMessage(id: Long): Message? {
        return messages.remove(id)
    }

}