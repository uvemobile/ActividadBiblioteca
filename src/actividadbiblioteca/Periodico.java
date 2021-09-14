
package actividadbiblioteca;

/**
 *
 * @author uvemo
 */
public class Periodico extends Documentos {

    public Periodico(String id, String nombre, String editorial,String autor, int fecha) {
        super(id, nombre, editorial, autor, fecha);
    }

    @Override
    public String toString() {
        return "Periodico: " + id + " " + nombre + " " + editorial + " " +autor + " " + fecha;
    }
    
}
