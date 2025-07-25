package uce.edu.web.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import uce.edu.web.api.service.IDoctorService;
import uce.edu.web.api.service.mapper.DoctorMapper;
import uce.edu.web.api.service.to.DoctorTo;

@Path("/doctores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoctorController {

    @Inject
    private IDoctorService doctorService;

    @GET
    @Path("")
    public Response consultar(){
        List<DoctorTo> doctorTo = this.doctorService.consultarDoctores().stream()
                .map(DoctorMapper::toTo)
                .collect(Collectors.toList());
        return Response.status(Response.Status.OK).entity(doctorTo).build();
    }

    @GET
    @Path("/{id}")
    public Response consultarPorId(@PathParam("id") Integer id){
             DoctorTo productoTo = DoctorMapper.toTo(this.doctorService.consultarPorId(id));
        return Response.status(Response.Status.OK).entity(productoTo).build();
    }

    @POST
    @Path("")
    public Response agregar(DoctorTo doctorTo){
        this.doctorService.agregar(DoctorMapper.toEntity(doctorTo));
        return Response.status(Response.Status.CREATED).build();
    }
    
}
