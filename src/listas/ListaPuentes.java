/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.HashMap;

/**
 *
 * @author Josue
 */
public class ListaPuentes {
    
    private final HashMap<String, String[]> lista = new HashMap<>();
    private static final String AMOR[] = {"calavera", "militar", "volcan", "desierto"};
    private static final String CALAVERA[] = {"circo", "militar", "amor", "flor"};
    private static final String VOLCAN[] = {"flor", "desierto", "amor"};
    private static final String CIRCO[] = {"flor", "selva", "ruina", "calavera"};
    private static final String DULCE[] = {"ruina", "playa", "militar"};
    private static final String PLAYA[] = {"selva", "dulce", "ruina"};
    private static final String SELVA[] = {"playa" ,"ruinas", "circo"};
    private static final String RUINA[] = {"circo" ,"selva", "playa", "dulce" , "militar"};
    private static final String DESIERTO[] = {"flor" ,"amor", "volcan"};
    private static final String FLOR[] = {"circo" ,"calavera", "desierto", "volcan"};
    private static final String MILITAR[] = {"calavera" ,"ruina", "dulce", "amor"};
    
    
    public ListaPuentes() {
        lista.put("amor", AMOR);
        lista.put("calavera", CALAVERA);
        lista.put("volcan", VOLCAN);
        lista.put("circo", CIRCO);
        lista.put("dulce", DULCE);
        lista.put("playa", PLAYA);
        lista.put("selva", SELVA);
        lista.put("ruina", RUINA);
        lista.put("desierto", DESIERTO);
        lista.put("flor", FLOR);
        lista.put("militar", MILITAR);
    }
    
    public String getDestino(String ubicacion, int tile){
        String[] list = lista.get(ubicacion);
        String retorno = "";
        if(tile==53 || tile==54){
            retorno = list[0];
        }else if(tile==55 || tile==56){
            retorno = list[1];
        }else if(tile==57 || tile==58){
            retorno = list[2];
        }else if(tile==59 || tile==60){
            retorno = list[3];
        }else if(tile==51 || tile==62){
            retorno = list[4];
        }
        return retorno;
    }
}
