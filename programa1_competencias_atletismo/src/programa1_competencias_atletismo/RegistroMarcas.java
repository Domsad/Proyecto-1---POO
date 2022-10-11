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
}
