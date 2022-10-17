package programa1_competencias_atletismo;
import java.util.ArrayList;
public class Visor extends Atleta {
    private ArrayList<Atleta> listaAtletas;
    
    public Visor(String pNombre,String pApellido1,String pApellido2,String pIdentificacion,
        String pPais, String pFechanacimiento,String pCorreo,String pTelefono,
        ArrayList<Atleta> pListaAtletas){
        super(pNombre, pApellido1, pApellido2, pIdentificacion,
         pPais,  pFechanacimiento, pCorreo, pTelefono);
        listaAtletas = pListaAtletas;
    }
}
