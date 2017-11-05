/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author aleff
 */
@Path("animes")
public class AnimesWs {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnimesWs
     */
    public AnimesWs() {
    }

    /**
     * Retrieves representation of an instance of ws.AnimesWs
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    public String getJson() {
        return "O meu primeiro WS restfull";
    }

    /**
     * PUT method for updating or creating an instance of AnimesWs
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}