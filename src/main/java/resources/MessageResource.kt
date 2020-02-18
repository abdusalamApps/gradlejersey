package resources

import models.Message
import services.MessageService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/messages")
public class MessageResource {

    var messageService = MessageService()


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMessages(): List<Message> {
        return messageService.getMessages()
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getMessageById(@PathParam("messageId") messageId: Long): Message? {
        return messageService.getMessage(messageId)
    }
}