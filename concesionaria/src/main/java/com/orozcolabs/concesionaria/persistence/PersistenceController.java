package com.orozcolabs.concesionaria.persistence;

import com.orozcolabs.concesionaria.logic.Automovil;
import com.orozcolabs.concesionaria.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        
        autoJPA.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return autoJPA.findAutomovilEntities();
        
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Automovil traerAuto(int idAuto) {
        return autoJPA.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
