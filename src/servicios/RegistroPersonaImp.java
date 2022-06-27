package servicios;

import modelos.Persona;
import modelos.Repertorio;
import modelos.Lista;

public class RegistroPersonaImp implements IRegistroPersonas{
    
    @Override
    public void registroPersonas(Persona p, Repertorio r, Lista l) {
        r.registrarPersona(p);
    }
    
}
