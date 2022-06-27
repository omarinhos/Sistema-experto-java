package modelos;

import java.util.ArrayList;

public class Respuestas {
    ArrayList<String> respuestas = new ArrayList<>();
          
    public void agregarRespuesta(String r){
        respuestas.add(r);
    }
    
    public ArrayList<String> getRespuestas(){
        return respuestas;
    }
    
    public void editarRespuestas(String x, int pos){
        respuestas.set(pos, x);
    }
}
