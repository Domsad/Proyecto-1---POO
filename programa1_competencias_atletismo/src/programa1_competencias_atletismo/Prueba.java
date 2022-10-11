
package programa1_competencias_atletismo;

public class Prueba {
    private String nombre,genero,categoria;

    public Prueba(String pNombre, String pGenero, String pCategoria){
        nombre = pNombre;
        genero = pGenero;
        categoria = pCategoria;
    }
    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public String getCategoria(){
        return categoria;
    }
    @Override
    public String toString() {
        // When you print out instance of A, value of its foo
        // field will be printed out
        return nombre + " " + genero + " " + categoria;
    }
}
