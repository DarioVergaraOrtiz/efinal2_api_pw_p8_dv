package uce.edu.web.api.service.mapper;

import uce.edu.web.api.repository.model.Doctor;
import uce.edu.web.api.service.to.DoctorTo;

public class DoctorMapper {

    public static DoctorTo toTo(Doctor doctor){
        
        DoctorTo dt = new DoctorTo();
        dt.setId(doctor.getId());
        dt.setCedula(doctor.getCedula());
        dt.setNombre(doctor.getNombre());
        dt.setApellido(doctor.getApellido());
        dt.setGenero(doctor.getGenero());

        return dt;
    }

    public static Doctor toEntity(DoctorTo doctorTo){
        
        Doctor d = new Doctor();
        d.setId(doctorTo.getId());
        d.setCedula(doctorTo.getCedula());
        d.setNombre(doctorTo.getNombre());
        d.setApellido(doctorTo.getApellido());
        d.setGenero(doctorTo.getGenero());

        return d;
    }
    
}
