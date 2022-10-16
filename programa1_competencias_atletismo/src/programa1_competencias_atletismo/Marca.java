package programa1_competencias_atletismo;

public class Marca {
    private Competencia competencia;
    private Disciplina disciplina;
    private Prueba prueba;
    private String marca;
    private int dorsal;
    private Atleta atleta;
    
    public Marca(Competencia pCompetencia,Disciplina pDisciplina, Prueba pPrueba, String pMarca, int pDorsal, Atleta pAtleta){
        competencia = pCompetencia;
        disciplina = pDisciplina;
        prueba = pPrueba;
        marca = pMarca;
        dorsal = pDorsal;
        atleta = pAtleta;
        }
    
    public Atleta getAtleta(){
        return atleta;
    }
    
    public Competencia getCompetencia(){
        return competencia;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    
    public String getInfo(){
        return marca+ " " + atleta.getIdentificacion() + " " +competencia.getNombre()+" "+ prueba.getNombre();
    }
            
}
