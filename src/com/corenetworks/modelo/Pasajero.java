package com.corenetworks.modelo;

import java.util.Objects;

public class Pasajero {
    private String nombre;
    private String dni;

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(nombre, pasajero.nombre) && Objects.equals(dni, pasajero.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }

    public Pasajero() {
    }

    public Pasajero(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
