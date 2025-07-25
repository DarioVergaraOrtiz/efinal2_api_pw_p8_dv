package uce.edu.web.api.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="paciente")
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="paci_id")
    private Integer id;

    @Column(name="paci_cedula")
    private Integer cedula;

    @Column(name="paci_nombre")
    private String nombre;

    @Column(name="paci_apellido")
    private String apellido;

    @Column(name="paci_fechaNacimiento")
    private String fechaNacimiento;


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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}



