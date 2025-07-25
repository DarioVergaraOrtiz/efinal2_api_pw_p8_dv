package uce.edu.web.api.repository;

import java.util.List;

import uce.edu.web.api.repository.model.Doctor;

public interface IDoctorRepo {
    
    public List<Doctor> consultarDoctores();
    public Doctor consultarPorId(Integer id);
    public void guardar(Doctor doctor);

}
