package modelos;

import java.util.ArrayList;

public class Lista {
    
    ArrayList<Respuestas>listas = new ArrayList<>();
    
    public Lista(){
        
    }
    
    public void agregarRespuestas(Respuestas r){
        listas.add(r);
    }
     
    public ArrayList<Respuestas> getListas(){
        return listas;
    }
    
   
}
