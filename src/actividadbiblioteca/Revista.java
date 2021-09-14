
package actividadbiblioteca;



/**
 *
 * @author uvemo
 */
public class Revista extends Documentos{

    public Revista(String id, String nombre, String editorial, String autor, int fecha) {
        super(id, nombre, editorial, autor, fecha);
    }

    @Override
    public String toString() {
        return "Revista: " + id + " " + nombre + " " + editorial + " " +autor + " " + fecha;
    }

   
    
}
