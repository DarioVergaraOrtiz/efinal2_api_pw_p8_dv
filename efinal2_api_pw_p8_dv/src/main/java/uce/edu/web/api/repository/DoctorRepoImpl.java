package uce.edu.web.api.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.web.api.repository.model.Doctor;

@ApplicationScoped
@Transactional
public class DoctorRepoImpl  implements IDoctorRepo{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Doctor> consultarDoctores() {
        TypedQuery mQuery = this.entityManager.createQuery("SELECT d FROM Doctor d",Doctor.class);
        return mQuery.getResultList();
    }

    @Override
    public Doctor consultarPorId(Integer id) {
        return this.entityManager.find(Doctor.class, id);
    }

    @Override
    public void guardar(Doctor doctor) {
        this.entityManager.persist(doctor);
    }



}
