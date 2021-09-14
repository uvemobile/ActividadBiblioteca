
package actividadbiblioteca;


/**
 *
 * @author uvemo
 */
public class Ecientifico extends Documentos {

    public Ecientifico(String id, String nombre, String editorial, String autor, int fecha) {
        super(id, nombre, editorial, autor, fecha);
    }

    @Override
    public String toString() {
        return "Ecientifico:" + id + " " + nombre + " " + editorial + " " +autor + " " + fecha;
    }
    
   
}
