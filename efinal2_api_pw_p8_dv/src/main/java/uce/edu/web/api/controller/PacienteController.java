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
import uce.edu.web.api.service.IPacienteService;
import uce.edu.web.api.service.mapper.PacienteMapper;
import uce.edu.web.api.service.to.PacienteTo;

@Path("/pacientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteController {
    @Inject
    private IPacienteService pacienteService;

    @GET
    @Path("")
    public Response consultar(){
        List<PacienteTo> pacienteTo = this.pacienteService.consultarPacientes().stream()
                .map(PacienteMapper::toTo)
                .collect(Collectors.toList());
        return Response.status(Response.Status.OK).entity(pacienteTo).build();
    }

    @GET
    @Path("/{id}")
    public Response consultarPorId(@PathParam("id") Integer id){
             PacienteTo pacienteTo = PacienteMapper.toTo(this.pacienteService.consultarPorId(id));
        return Response.status(Response.Status.OK).entity(pacienteTo).build();
    }

    @POST
    @Path("")
    public Response agregar(PacienteTo pacienteTo){
        this.pacienteService.guardar(PacienteMapper.toEntity(pacienteTo));
        return Response.status(Response.Status.CREATED).build();
    }
}
