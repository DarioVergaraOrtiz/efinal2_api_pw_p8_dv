package uce.edu.web.api.repository;

import java.util.List;

import uce.edu.web.api.repository.model.Paciente;

public interface IPacienteRepo {

    public List<Paciente> consultarPacientes();
    public Paciente consultarPorId(Integer id);
    public void guardar(Paciente paciente);

    
}
