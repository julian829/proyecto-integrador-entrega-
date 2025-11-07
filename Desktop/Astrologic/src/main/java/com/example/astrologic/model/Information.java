package com.example.astrologic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Information {
    @Id
    private int iden;
    private String correo;
    private String nombre;
    private Integer edad;

    public int getIden() { return iden; }
    public void setIden(int iden) { this.iden = iden; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }
}
