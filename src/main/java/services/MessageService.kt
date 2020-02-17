package services

import models.Message

public class MessageService {

    fun getMessages() : List<Message> {
        return listOf<Message>(
                Message(text = "m1", author = "usr1", id = 0),
                Message(text = "m2", author = "usr2", id = 1),
                Message(text = "m3", author = "usr3", id = 2)
        )
    }
}