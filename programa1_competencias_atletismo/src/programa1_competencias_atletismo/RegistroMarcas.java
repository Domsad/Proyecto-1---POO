package programa1_competencias_atletismo;
import java.util.ArrayList;

public class RegistroMarcas {
    private ArrayList<Atleta> registroAtletas;
    private ArrayList<Disciplina> registroDisciplinas;
    private ArrayList<Visor> registroVisores;
    
    public RegistroMarcas(){
        registroAtletas = new ArrayList<>();
        registroDisciplinas = new ArrayList<>();
        registroVisores = new ArrayList<>();
    }
    public ArrayList<Atleta> getRegistroAtletas(){
        return registroAtletas;
    }
    public ArrayList<Disciplina> getRegistroDisciplinas(){
        return registroDisciplinas;
    }
    public ArrayList<Visor> getRegistroVisores(){
        return registroVisores;
    }
    
    public void agregarAtleta(Atleta atleta){
        registroAtletas.add(atleta);
    }
    
    public void eliminarAtleta(String pidentificacion){
        int i = 0;
        for(Atleta atleta: registroAtletas){
            if (atleta.getIdentificacion().equals(pidentificacion)){
                registroAtletas.remove(i);
                break;
            }
            i++;
        }
    }
    
    public boolean verificarIdentificacionRepetida(String pidentificacion){
        for(Atleta atleta: registroAtletas){
            if (atleta.getIdentificacion().equals(pidentificacion)){
                return true;
            }
        }
        return false;
    }
}
