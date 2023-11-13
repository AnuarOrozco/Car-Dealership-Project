
package com.orozcolabs.concesionaria;

import com.orozcolabs.concesionaria.gui.Principal;

public class Concesionaria {

    public static void main(String[] args) {
        
        Principal principalScreen = new Principal();
        
        // We call and make visible our GUI
        principalScreen.setVisible(true);
        principalScreen.setLocationRelativeTo(null);
        principalScreen.setResizable(false);
        
    }
}
