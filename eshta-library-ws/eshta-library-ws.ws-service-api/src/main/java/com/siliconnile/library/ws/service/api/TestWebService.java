package com.siliconnile.library.ws.service.api;

import com.siliconnile.library.dto.SampleObjectDTO;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

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
}
