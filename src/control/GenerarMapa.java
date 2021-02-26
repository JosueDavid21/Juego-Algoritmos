/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Josue
 */
public class GenerarMapa {

    private String ruta;
    
    public GenerarMapa(String ruta) {
        this.ruta = ruta;
    }

    public String leerArchivoTexto() {
        String contenido = "";
        InputStream entradaBytes = ClassLoader.class.getResourceAsStream(ruta);
        BufferedReader lector = new BufferedReader(new InputStreamReader(entradaBytes));
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
        return contenido;
    }

    private void obtenerMatriz() {
//        //CAPAS
//        JSONArray capas = obtenerArrayJSON(globalJSON.get("layers").toString());
//
//        //INICIAR CAPAS
//        for (int i = 0; i < capas.size(); i++) {
//            JSONObject datosCapa = obtenerObjetoJSON(capas.get(i).toString());
//
//            int anchoCapa = obtenerIntDesdeJSON(datosCapa, "width");
//            int altoCapa = obtenerIntDesdeJSON(datosCapa, "height");
//            int xCapa = obtenerIntDesdeJSON(datosCapa, "x");
//            int yCapa = obtenerIntDesdeJSON(datosCapa, "y");
//            String tipo = datosCapa.get("type").toString();
//
//            switch (tipo) {
//                case "tilelayer":
//                    JSONArray sprites = obtenerArrayJSON(datosCapa.get("data").toString());
//                    int[] spritesCapa = new int[sprites.size()];
//                    for (int j = 0; j < sprites.size(); j++) {
//                        int codigoSprite = Integer.parseInt(sprites.get(j).toString());
//                        spritesCapa[j] = codigoSprite - 1;
//                    }
//                    this.capasSprites.add(new CapaSprites(anchoCapa, altoCapa, xCapa, yCapa, spritesCapa));
//                    break;
//                case "objectgroup":
//                    JSONArray rectangulos = obtenerArrayJSON(datosCapa.get("objects").toString());
//                    Rectangle[] rectangulosCapa = new Rectangle[rectangulos.size()];
//                    for (int j = 0; j < rectangulos.size(); j++) {
//                        JSONObject datosRectangulo = obtenerObjetoJSON(rectangulos.get(j).toString());
//
//                        int x = obtenerIntDesdeJSON(datosRectangulo, "x");
//                        int y = obtenerIntDesdeJSON(datosRectangulo, "y");
//                        int ancho = obtenerIntDesdeJSON(datosRectangulo, "width");
//                        int alto = obtenerIntDesdeJSON(datosRectangulo, "height");
//
//                        if (x == 0) {
//                            x = 1;
//                        }
//                        if (y == 0) {
//                            y = 1;
//                        }
//                        if (ancho == 0) {
//                            ancho = 1;
//                        }
//                        if (alto == 0) {
//                            alto = 1;
//                        }
//
//                        Rectangle rectangulo = new Rectangle(x, y, ancho, alto);
//                        rectangulosCapa[j] = rectangulo;
//                    }
//                    this.capasColisiones.add(new CapaColisiones(anchoCapa, altoCapa, xCapa, yCapa, rectangulosCapa));
//
//                    break;
//            }
//        }
    }

}
