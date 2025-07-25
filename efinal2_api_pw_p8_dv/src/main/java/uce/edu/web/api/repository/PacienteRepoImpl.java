package uce.edu.web.api.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.web.api.repository.model.Paciente;

@ApplicationScoped
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Paciente> consultarPacientes() {
        TypedQuery<Paciente> mQuery = this.entityManager.createQuery("SELECT p FROM Paciente p", Paciente.class);
        return mQuery.getResultList();
    }

    @Override
    public Paciente consultarPorId(Integer id) {
        return this.entityManager.find(Paciente.class, id);
    }

    @Override
    public void guardar(Paciente paciente) {
        this.entityManager.persist(paciente);
    }
    
}
