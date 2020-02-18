package resources

import models.Message
import services.MessageService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/messages")
public class MessageResource {

    var messageService = MessageService()


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMessages(): List<Message> {
        messageService.printMessages()
        return messageService.getMessages()
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getMessageById(@PathParam("messageId") messageId: Long): Message? {
        return messageService.getMessage(messageId)
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun addMessage(message: Message): Message? {
        return messageService.addMessage(message)
    }

    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun updateMessage(@PathParam("messageId") messageId: Long, message: Message): Message? {
        message.id = messageId
        return messageService.updateMessage(message)
    }

    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteMessage(@PathParam("messageId") messageId: Long) {
        messageService.deleteMessage(messageId)
        messageService.printMessages()
    }
}