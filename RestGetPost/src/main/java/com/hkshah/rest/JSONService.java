package com.hkshah.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/person")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Person getPersonInJSON() {
		Person person = new Person();
		person.setFirstName("Hardik");
		person.setLastName("Shah");
		return person;
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createPersonInJSON(Person person) {
		String result = "Person created : " + person;
		System.out.println(result);
		return Response.status(201).entity(result).build();
	}
}