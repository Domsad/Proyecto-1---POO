package programa1_competencias_atletismo;

public class Marca {
    private Competencia competencia;
    private Disciplina disciplina;
    private Prueba prueba;
    private Marca marca;
    private int dorsal;
    
    public Marca(Competencia pCompetencia,Disciplina pDisciplina, Prueba pPrueba, Marca pMarca, int pDorsal){
        competencia = pCompetencia;
        disciplina = pDisciplina;
        prueba = pPrueba;
        marca = pMarca;
        dorsal = pDorsal;
    }
}
