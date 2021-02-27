/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import control.GenerarMapa;
import entes.Mapa;
import java.util.HashMap;

/**
 *
 * @author grace
 */
public class ListaMapas {
    
    private final HashMap<String, Mapa> lista = new HashMap<>();
    private final String separador = System.getProperty("file.separator");
    
    public ListaMapas() {
    }
    
    private String getRutaIMG(){
        return "C:\\Users\\grace\\Desktop\\JosueTemp\\Algoritmos\\Juego-Algoritmos\\src\\imagenes\\islas\\";
//        return separador + "Juego-Algoritmos" + separador + "src" + separador + "imagenes" + separador + "islas" + separador;
    }
    
    private String getRutaJSON(){
        return "C:\\Users\\grace\\Desktop\\JosueTemp\\Algoritmos\\Juego-Algoritmos\\src\\json\\";
//        return separador + "Juego-Algoritmos" + separador + "src" + separador + "json" + separador;
    }
    
    public HashMap<String, Mapa> getLista() {
        lista.put("amor", new Mapa("amor", getRutaIMG()+"amor.png", new GenerarMapa(getRutaJSON().concat("amor.json")).obtenerMatriz()));
        lista.put("calavera", new Mapa("calavera", getRutaIMG()+"calavera.png", new GenerarMapa(getRutaJSON().concat("calavera.json")).obtenerMatriz()));
        lista.put("volcan", new Mapa("volcan", getRutaIMG()+"volcan.png", new GenerarMapa(getRutaJSON().concat("volcan.json")).obtenerMatriz()));

        
        
        
        return lista;
    }
    
    
}
