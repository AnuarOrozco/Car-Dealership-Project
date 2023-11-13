package com.orozcolabs.concesionaria.logic;

import com.orozcolabs.concesionaria.persistence.PersistenceController;
import java.util.HashSet;
import java.util.List;

public class Controller {

    PersistenceController persistenceControl = new PersistenceController();
    
    public void agregarAuto(String modelo, String marca, String motor, String color, String placa, int cantidadPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        
        persistenceControl.agregarAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return persistenceControl.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        
        persistenceControl.borrarAuto(idAuto);
        
    }

    public Automovil traerAuto(int idAuto) {
        return persistenceControl.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int cantidadPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        
        persistenceControl.modificarAuto(auto);
        
    }
    
    
    
}
