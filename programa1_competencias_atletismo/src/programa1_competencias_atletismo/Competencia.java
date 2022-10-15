package programa1_competencias_atletismo;

import java.util.ArrayList;

public class Competencia {
    
    private String nombre,pais,lugar,fechainicial,fechafinal;
    private int identificacion;
    private ArrayList<Disciplina> registrodisciplinas;
    public Competencia(){
        nombre = "";
        pais = "";
        lugar = "";
        fechainicial = "";
        fechafinal = "";
        identificacion = 0;
        registrodisciplinas = new ArrayList<>();
    }
    public Competencia(String pNombre,int pIdentificacion, 
    String pPais, String pLugar, String pFechainicial, String pFechafinal){
        nombre = pNombre;
        identificacion = pIdentificacion;
        pais = pPais;
        lugar = pLugar;
        fechainicial = pFechainicial;
        fechafinal = pFechafinal;
        registrodisciplinas = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public int getIdentificacion(){
        return identificacion;
    }
    public String getFechaInicial(){
        return fechainicial;
    }
    public String getFechaFinal(){
        return fechafinal;
    }
    public ArrayList<Disciplina> getRegistroDisciplinas(){
        return registrodisciplinas;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public void setPais(String pPais){
        pais = pPais;
    }
    public void setLugar(String pLugar){
        lugar = pLugar;
    }
    public void setFechaInicial(String pFechaInicial){
        fechainicial = pFechaInicial;
    }
    public void setFechaFinal(String pFechaFinal){
        fechafinal = pFechaFinal;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n"
            + "Identificacion: " + identificacion + "\n"
            + "Pais: " + pais + "\n"
            + "Lugar: " + lugar + "\n"
            + "Fecha Inicial: " + fechainicial + "\n"
            + "Fecha Final: " + fechafinal + "\n";
    }
}
