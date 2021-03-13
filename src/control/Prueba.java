/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entes.GenerarDimension;
import entes.Isla;
import java.util.HashMap;
import listas.ListaMapas;
import vistas.VistaIsla;

/**
 *
 * @author grace
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap lista = new ListaMapas().getLista();
        new VistaIsla((Isla) lista.get("volcan")).setVisible(true);
//        new GenerarDimension().toString();
    }
    
}
