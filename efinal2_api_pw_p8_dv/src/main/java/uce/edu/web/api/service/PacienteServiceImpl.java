package uce.edu.web.api.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.web.api.repository.IPacienteRepo;
import uce.edu.web.api.repository.model.Paciente;

@ApplicationScoped
public class PacienteServiceImpl implements IPacienteService{

    @Inject
    private IPacienteRepo pacienteRepo;

    @Override
    public List<Paciente> consultarPacientes() {
        return this.pacienteRepo.consultarPacientes();
    }

    @Override
    public Paciente consultarPorId(Integer cedula) {
        return this.pacienteRepo.consultarPorId(cedula);
    }

    @Override
    public void guardar(Paciente paciente) {
        this.pacienteRepo.guardar(paciente);
    }
    
}
