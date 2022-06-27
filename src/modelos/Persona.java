package modelos;

import java.util.Date;

public class Persona {
    
    private String nombres;
    private String apellidos;
    private int edad;
    private int porcentaje;
    private String tieneDiabetes;
    private Date date;

    public Persona(String nombres, String apellidos, int edad, int porcentaje, String tieneDiabetes) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.porcentaje = porcentaje;
        this.tieneDiabetes = tieneDiabetes;
        date = new Date();
    }

    public Persona() {
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }
    
    public String getTieneDiabetes() {
        return tieneDiabetes;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setPorcentaje(int porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public void setTieneDiabetes(String tieneDiabetes){
        this.tieneDiabetes = tieneDiabetes;
    }
    
    
}
