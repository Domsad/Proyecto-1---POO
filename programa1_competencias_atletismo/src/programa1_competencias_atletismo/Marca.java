package programa1_competencias_atletismo;

public class Marca {
    private Competencia competencia;
    private Disciplina disciplina;
    private Prueba prueba;
    private String marca;
    private int dorsal,lugar;
    private Atleta atleta;

    public Marca(Competencia pCompetencia,Disciplina pDisciplina, Prueba pPrueba,
            String pMarca, int pDorsal, Atleta pAtleta,int pLugar){
        competencia = pCompetencia;
        disciplina = pDisciplina;
        prueba = pPrueba;
        marca = pMarca;
        dorsal = pDorsal;
        atleta = pAtleta;
        lugar  = pLugar;
        }
    
    public Atleta getAtleta(){
        return atleta;
    }
    public Competencia getCompetencia(){
        return competencia;
    }
    public Prueba getPrueba(){
        return prueba;
    }
    public int getDorsal(){
        return dorsal;
    }
    public String getMarca(){
        return marca;
    }
    public int getLugar(){
        return lugar;
    }
    public String getInfo(){
        return marca+ " " + atleta.getIdentificacion() + " " +competencia.getNombre()+" "+ prueba.getNombre();
    }
    public void setLugar(int pLugar){
        lugar = pLugar;
    }
            
}
