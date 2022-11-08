package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table (name = "gasista")
public class GasistaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private int telefono;
    private String foto;
    private int edad;


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
}
