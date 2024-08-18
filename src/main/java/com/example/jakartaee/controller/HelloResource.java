package com.example.jakartaee.controller;

import com.example.jakartaee.model.Ativos;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/rest")
public class HelloResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response ativos() {
        try {
            Ativos ativos = new Ativos(1, "Bitcoin", "Cripto", 50000.00, 0.05);
            return Response.ok(ativos).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                           .entity("Internal Server Error")
                           .build();
        }
    }
}