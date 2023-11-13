package com.orozcolabs.concesionaria.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    
    
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int cantidadPuertas;
    private String modelo, marca, motor, color, placa;
    
    
    // Constructors
    public Automovil() {
    }

    public Automovil(int id, int cantidadPuertas, String modelo, String marca, String motor, String color, String placa) {
        this.id = id;
        this.cantidadPuertas = cantidadPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.placa = placa;
    }

    
    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
