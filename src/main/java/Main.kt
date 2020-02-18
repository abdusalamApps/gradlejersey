import models.Message
import services.MessageService

val messages: HashMap<Long, Message> = HashMap()

fun main() {
    val messageService = MessageService()
    messageService.printMessages()
    println()
    println("Before Deletion")
    messageService.printMessages()
    println()
    println("delete ${messageService.deleteMessage(1)}")
    println()
    println("After Deletion")
    messageService.printMessages()
    println("--End of Print--")

/*
    messages[0L] = Message(id = 0L, message = "Hello Zere!", author = "Zirgovic")

    println("Before Deletion")
    for (m in messages)
        println(m.toString())

    println("removed ${deleteMessage(0)}")
    println()
    println("After Deletion")
    for (m in messages)
        println(m.toString())
*/

}

fun deleteMessage(id: Long): Message? {
    return messages.remove(id)
}