/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import control.GenerarIsla;
import entes.Isla;
import java.util.HashMap;

/**
 *
 * @author grace
 */
public class ListaMapas {
    
    private final HashMap<String, Isla> lista = new HashMap<>();
    private final String separador = System.getProperty("file.separator");
    
    public ListaMapas() {
    }
    
    private String getRutaIMG(){
        return "src" + separador + "imagenes" + separador + "islas" + separador;
    }
    
    private String getRutaJSON(){
        return "src" + separador + "json" + separador;
    }
    
    public HashMap<String, Isla> getLista() {
        lista.put("amor", new Isla("amor", getRutaIMG()+"amor.png", new GenerarIsla(getRutaJSON().concat("amor.json")).obtenerMatriz()));
        lista.put("calavera", new Isla("calavera", getRutaIMG()+"calavera.png", new GenerarIsla(getRutaJSON().concat("calavera.json")).obtenerMatriz()));
        lista.put("volcan", new Isla("volcan", getRutaIMG()+"volcan.png", new GenerarIsla(getRutaJSON().concat("volcan.json")).obtenerMatriz()));

        
        
        
        return lista;
    }
    
    
}
