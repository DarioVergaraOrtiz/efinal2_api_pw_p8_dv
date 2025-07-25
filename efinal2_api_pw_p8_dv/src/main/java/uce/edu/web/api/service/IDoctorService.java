package uce.edu.web.api.service;

import java.util.List;

import uce.edu.web.api.repository.model.Doctor;

public interface IDoctorService {
    
    public List<Doctor> consultarDoctores();

    public Doctor consultarPorId(Integer id);

    public void agregar(Doctor doctor);


}
