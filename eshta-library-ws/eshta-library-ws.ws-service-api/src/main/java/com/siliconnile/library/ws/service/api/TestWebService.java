package com.siliconnile.library.ws.service.api;






import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.siliconnile.library.dto.SampleObjectDTO;

/**
 * User: Andrew
 * Date: 6/27/13
 */

@Path("/")
public interface TestWebService {
    
    @GET
    @Path("/SampleObject/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SampleObjectDTO getSampleObjectById(@PathParam("id") Long id,
                                               @Context HttpServletResponse response);
    @POST
    @Path("/nabil/mul")
    Response mulxNumber(@FormParam("x")int firstnum,@FormParam("y")int secondnum);
}
