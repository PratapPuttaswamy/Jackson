package org.jaxrslearning.ReturnJSON.resouce;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.jaxrslearning.ReturnJSON.message.message;
import org.jaxrslearning.ReturnJSON.service.messageService;

@Path("/messages")
public class MessageResource {

	
	messageService messageService=new messageService();
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<message> getMessages()
{
	return messageService.getAllMessages();
	
}
}
