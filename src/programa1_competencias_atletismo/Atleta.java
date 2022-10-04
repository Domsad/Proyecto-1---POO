 package programa1_competencias_atletismo;

public class Atleta extends Visor {
    private String nombre,apellido1,apellido2,identificacion,pais,
                   fechanacimiento,correo,telefono;
    
    Atleta(String pNombre,String pApellido1,String pApellido2,String pIdentificacion,
            String pPais, String pFechanacimiento,String pCorreo,String pTelefono){
        nombre = pNombre;
        apellido1 = pApellido1;
        apellido2 = pApellido2;
        identificacion = pIdentificacion;
        pais = pPais;
        fechanacimiento = pFechanacimiento;
        correo = pCorreo;
        telefono = pTelefono;
    }
}
