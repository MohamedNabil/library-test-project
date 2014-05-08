package com.siliconnile.library.ws.service.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.siliconnile.library.dto.BookDTO;

/**
 * author: M.Nabil
 * Date: 7/5/14
 */
@Path("/lend")
public interface LendBookWebService {

	    @GET
	    @Path("/book/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public BookDTO lendBooKById(@PathParam("id") Long id);
	    
	    @POST
	    @Path("/add")
	    @Produces(MediaType.APPLICATION_JSON)
	    public BookDTO addBooK(@FormParam("title") String title,@FormParam("author") String author,@FormParam("isbn") String isbn,
	    		@FormParam("photo") String photoUrl);
}
