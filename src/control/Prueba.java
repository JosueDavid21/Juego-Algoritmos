/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entes.Mapa;
import java.util.HashMap;
import listas.ListaMapas;
import vistas.Isla;

/**
 *
 * @author grace
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String separador = System.getProperty("file.separator");
        String ruta =  "C:\\Users\\grace\\Desktop\\Prueba\\src\\prueba\\amor.json";
        
        HashMap lista = new ListaMapas().getLista();
        new Isla((Mapa) lista.get("amor")).setVisible(true);

    }
    
}
