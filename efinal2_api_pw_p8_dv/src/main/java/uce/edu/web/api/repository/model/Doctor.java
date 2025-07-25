package uce.edu.web.api.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="doctor")
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="doc_id")
    private Integer id;

    @Column(name="doc_cedula")
    private Integer cedula;

    @Column(name="doc_nombre")
    private String nombre;

    @Column(name="doc_apellido")
    private String apellido;

    @Column(name="doc_genero")
    private String genero;

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

}
