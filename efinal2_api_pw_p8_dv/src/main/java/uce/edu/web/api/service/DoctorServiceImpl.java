package uce.edu.web.api.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.web.api.repository.IDoctorRepo;
import uce.edu.web.api.repository.model.Doctor;


@ApplicationScoped
public class DoctorServiceImpl implements IDoctorService{

    @Inject
    private IDoctorRepo doctorRepo;

    @Override
    public List<Doctor> consultarDoctores() {
        return this.doctorRepo.consultarDoctores();
    }

    @Override
    public Doctor consultarPorId(Integer id) {
       return this.doctorRepo.consultarPorId(id);

    }

    @Override
    public void agregar(Doctor doctor) {
        this.doctorRepo.guardar(doctor);
    }
    
}
