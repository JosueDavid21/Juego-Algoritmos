/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author grace
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String separador = System.getProperty("file.separator");
        String ruta = separador + "src" + separador + "json" + separador + "amor.json";
        System.out.println(ruta);
        System.out.println(new GenerarMapa(ruta).leerArchivoJSON());
    }
    
}
