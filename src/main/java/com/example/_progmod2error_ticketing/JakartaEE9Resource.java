package com.example._progmod2error_ticketing;

import jakarta.ws.rs.*;
import token.TOKEN;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

@Path("Jakartaee9")
public class JakartaEE9Resource {
    @GET
    public Response ping(@HeaderParam("X-Auth-Token") String token){
        JSONObject resp = new JSONObject();
        if(!token.equals(new TOKEN().getTOKEN())){
            resp.put("Error", "Nincs tokoen!");
            return Response.status(Response.Status.UNAUTHORIZED)
                    .type(MediaType.APPLICATION_JSON)
                    .entity(resp)
                    .build();
        }
        resp.put("Keres", "Rendben");
        resp.put("username","korbandras");
        return Response.ok(resp.toString()).type(MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Path("sendRecieveDemaData")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendRecieveDemoData(Object o){
        JSONObject response = new JSONObject(o);
        return Response.ok(o.toString(), MediaType.APPLICATION_JSON).build();
    }
}
