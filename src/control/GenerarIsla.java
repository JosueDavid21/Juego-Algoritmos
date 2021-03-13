/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Josue
 */
public class GenerarIsla {

    private String ruta;

    public GenerarIsla(String ruta) {
        this.ruta = ruta;
    }

    //      LEO EL ARCHIVO JSON Y LO CARGO
    public String leerArchivoJSON() {
        String contenido = "";
        FileReader entradaBytes;
        try {
            entradaBytes = new FileReader(new File(ruta));
            BufferedReader lector = new BufferedReader(entradaBytes);
            String linea;
            try {
                while ((linea = lector.readLine()) != null) {
                    contenido += linea;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (entradaBytes != null) {
                        entradaBytes.close();
                    }
                    if (lector != null) {
                        lector.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerarIsla.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }

    //      GENERO MI MATRIZ
    public int[][] obtenerMatriz() {
        int[][] matriz = new int[32][20];
        String contenido = leerArchivoJSON();
        JSONObject globalJSON = obtenerObjetoJSON(contenido);
        //          LAYERS
        JSONArray layers = obtenerArrayJSON(globalJSON.get("layers").toString());
        JSONArray tiles = obtenerArrayJSON(obtenerObjetoJSON(layers.get(0).toString()).get("tiles").toString());
        JSONObject objeto;
        int x, y, tile;
        for (int i = 0; i < tiles.size(); i++) {
            objeto = obtenerObjetoJSON(tiles.get(i).toString());
            x = obtenerIntDesdeJSON(objeto, "x");
            y = obtenerIntDesdeJSON(objeto, "y");
            tile = obtenerIntDesdeJSON(objeto, "tile");
            matriz[x][y] = tile;
        }
        return matriz;
    }  
    
    private int obtenerIntDesdeJSON(JSONObject objetoJSON, String clave) {
        return Integer.parseInt(objetoJSON.get(clave).toString());
    }

    private JSONObject obtenerObjetoJSON(String codigoJSON) {
        JSONParser lector = new JSONParser();
        JSONObject objetoJSON = null;
        try {
            Object recuperado = lector.parse(codigoJSON);
            objetoJSON = (JSONObject) recuperado;
        } catch (ParseException e) {
            System.out.println("Posicion: " + e.getPosition());
            System.out.println(e);
        }
        return objetoJSON;
    }

    private JSONArray obtenerArrayJSON(final String codigoJSON) {
        JSONParser lector = new JSONParser();
        JSONArray arrayJSON = null;
        try {
            Object recuperado = lector.parse(codigoJSON);
            arrayJSON = (JSONArray) recuperado;
        } catch (ParseException e) {
            System.out.println("Posicion: " + e.getPosition());
            System.out.println(e);
        }
        return arrayJSON;
    }

}
