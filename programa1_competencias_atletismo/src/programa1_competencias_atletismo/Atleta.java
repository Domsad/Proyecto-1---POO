package programa1_competencias_atletismo;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Atleta{
    
    private String nombre,apellido1,apellido2,identificacion,pais,
                   fechanacimiento,correo,telefono;
    
    public Atleta(){
        nombre = "";
        apellido1 = "";
        apellido2 = "";
        identificacion = "";
        pais = "";
        fechanacimiento = "";
        correo = "";
        telefono = "";
        
    }
    
    public Atleta(String pNombre,String pApellido1,String pApellido2,String pIdentificacion,
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
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido1 + " " + apellido2;
    }
    
    public String getPais(){
        return pais;
    }
    
    public String getFecha(){
        return fechanacimiento;        
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public void setApellido1(String pApellido1){
        apellido1 = pApellido1;
    }
    
    public void setApellido2(String pApellido2){
        apellido2 = pApellido2;
    }
      
    public void setIdentificacion(String pIdentificacion){
        identificacion = pIdentificacion;
    }
    
    public void setFecha(String pfecha){
        fechanacimiento = pfecha;
    }
    
    public void setCorreo(String pcorreo){
        correo = pcorreo;
    }
    
    public void setTelefono(String ptelefono){
        telefono = ptelefono;
    }
}
