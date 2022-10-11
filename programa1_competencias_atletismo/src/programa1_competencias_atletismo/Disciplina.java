package programa1_competencias_atletismo;
import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private ArrayList<Prueba> listaPruebas;
    
    public Disciplina(String pNombre){
        nombre = pNombre;
        listaPruebas = new ArrayList<>();
    }
    public Disciplina(String pNombre, ArrayList<Prueba> pListaPruebas){
        nombre = pNombre;
        listaPruebas = pListaPruebas;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<Prueba> getListaPruebas(){
        return listaPruebas;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
