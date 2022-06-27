package servicios;

import modelos.Resultados;

public class ResultadoImp implements IResultado{

    Resultados r = new Resultados();
    
    @Override
    public int porcentaje(int puntos) {
        return r.porcentaje(puntos);
    }
    @Override
    public String tieneDiabetes(int porcentaje) {
        return r.tieneDiabetes(porcentaje);
    }

    @Override
    public int respuesta(String opcion) {
        return r.respuesta(opcion);
    }
    
}
