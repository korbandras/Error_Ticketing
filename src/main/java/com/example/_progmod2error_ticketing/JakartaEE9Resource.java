package com.example._progmod2error_ticketing;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

public class JakartaEE9Resource {
    @GET
    public Response ping(){
        JSONObject resp = new JSONObject();
        resp.put("Keres", "Rendben");
        resp.put("username","korbandras");
        return Response.ok(resp).type(MediaType.APPLICATION_JSON).build();
    }
}
