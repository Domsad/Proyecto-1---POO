package programa1_competencias_atletismo;

import java.util.ArrayList;

public class Competencia {
    
    private String nombre,pais,lugar,fechainicial,fechafinal;
    private int identificacion;
    private ArrayList<Disciplina> registrodisciplinas;
    
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
    public int getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<Disciplina> getRegistroDisciplinas(){
        return registrodisciplinas;
    }
}
