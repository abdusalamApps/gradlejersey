package services

import database.Database
import models.Message
import java.util.ArrayList

class MessageService() {

    var messages: HashMap<Long, Message> = Database.messages

    init {
        messages[1L] = Message(id = 1L, message = "Hello Zere!", author = "Zirgovic")
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

    fun deleteMessage(id: Long): Message? {
        println("delete ${messages.remove(id)}")
        return messages.remove(id)
    }

    fun printMessages() {
        for (m in messages)
            println(m.toString())
    }


}