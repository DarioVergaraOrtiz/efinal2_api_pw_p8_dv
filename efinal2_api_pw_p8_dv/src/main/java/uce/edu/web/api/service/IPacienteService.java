package uce.edu.web.api.service;

import java.util.List;

import uce.edu.web.api.repository.model.Paciente;

public interface IPacienteService {

    public List<Paciente> consultarPacientes();
    public Paciente consultarPorId(Integer id);
    public void guardar(Paciente paciente);
    
}
