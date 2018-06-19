package org.jaxrslearning.ReturnJSON.service;

import java.util.ArrayList;
import java.util.List;

import org.jaxrslearning.ReturnJSON.message.message;

public class messageService {

	public List<message> getAllMessages(){
		message m1= new message (1L,"fhuf",null, "you");
		message m2= new  message (2L,"Web",null, "AgainYou");
		List<message> List=new ArrayList<>();
		List.add(m1);
		List.add(m2);
		return List;
	}
}
