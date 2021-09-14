
package actividadbiblioteca;



/**
 *
 * @author uvemo
 */
public class Libro extends Documentos {

    public Libro(String id, String nombre, String editorial, String autor, int fecha) {
        super(id, nombre, editorial, autor, fecha);
    }

    @Override
    public String toString() {
        return "Libro: " + id + " " + nombre + " " + editorial + " " +autor + " " + fecha;
    }


   
}
