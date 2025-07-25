package uce.edu.web.api.service.mapper;

import uce.edu.web.api.repository.model.Paciente;
import uce.edu.web.api.service.to.PacienteTo;


public class PacienteMapper {
    public static PacienteTo toTo(Paciente paciente){
        
        PacienteTo pt = new PacienteTo();
        pt.setId(paciente.getId());
        pt.setCedula(paciente.getCedula());
        pt.setNombre(paciente.getNombre());
        pt.setApellido(paciente.getApellido());
        pt.setFechaNacimiento(paciente.getFechaNacimiento());

        return pt;
    }

    public static Paciente toEntity(PacienteTo pacienteTo){
        
        Paciente p = new Paciente();
        p.setId(pacienteTo.getId());
        p.setCedula(pacienteTo.getCedula());
        p.setNombre(pacienteTo.getNombre());
        p.setApellido(pacienteTo.getApellido());
        p.setFechaNacimiento(pacienteTo.getFechaNacimiento());

        return p;
    }
}
