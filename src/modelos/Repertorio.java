package modelos;

import java.util.ArrayList;

public class Repertorio {
    
    private ArrayList<Persona> listado = new ArrayList<>();
    
    public void registrarPersona(Persona p){
        listado.add(p);
    }

    public ArrayList<Persona> getRepertorio() {
        return listado;
    }
    
}
