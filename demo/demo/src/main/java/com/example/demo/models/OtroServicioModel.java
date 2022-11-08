package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table (name = "otroServicio")
public class OtroServicioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private int telefono;
    private String foto;
    private int edad;
    private String rubro;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() { return telefono; }

    public void setTelefono(int telefono) { this.telefono = telefono;}

    public String getFoto() {return foto;}

    public void setFoto(String foto) {this.foto = foto;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getRubro() {return rubro;}

    public void setRubro(String rubro) {this.rubro = rubro;}
}
