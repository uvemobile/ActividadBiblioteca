
package actividadbiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uvemo
 */
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    ArrayList <Documentos> listaPrestamos;
    
    public Usuario() {
        this.listaPrestamos = new ArrayList<>();
    }

    
    public Usuario(String id, String nombre, String apellido) {
        this.listaPrestamos = new ArrayList<>();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
   public void alquilarDocumento(){
       Biblioteca prestamoBiblioteca = new Biblioteca(); 
       prestamoBiblioteca.setLibros();
       prestamoBiblioteca.setPeriodicos();
       prestamoBiblioteca.setRevistas();
       prestamoBiblioteca.setEcientifico();
       System.out.println("Introduce el id del documento a alquilar:");
       Scanner sc = new Scanner(System.in);
       String idPrestamo=sc.next();
       Boolean encontrado=false;
       
       for (int i = 0; i < prestamoBiblioteca.listaLibros.size(); i++) {
           if(idPrestamo.equals(prestamoBiblioteca.listaLibros.get(i).getId())){
               encontrado=true;
               listaPrestamos.add(prestamoBiblioteca.listaLibros.get(i));
               System.out.println("Alquiler realizado con éxito\n");
           }else{
               encontrado=false;
           }
       }       
       
       for (int i = 0; i < prestamoBiblioteca.listaRevistas.size(); i++) {
           if(idPrestamo.equals(prestamoBiblioteca.listaRevistas.get(i).getId())){
                encontrado=true;
                listaPrestamos.add(prestamoBiblioteca.listaRevistas.get(i));
                System.out.println("Alquiler realizado con éxito\n");
            }else{
               encontrado=false;
           }
       }
       for (int i = 0; i < prestamoBiblioteca.listaPeriodicos.size(); i++) {
           if(idPrestamo.equals(prestamoBiblioteca.listaPeriodicos.get(i).getId())){
                encontrado=true;
                listaPrestamos.add(prestamoBiblioteca.listaPeriodicos.get(i));
               System.out.println("Alquiler realizado con éxito\n");
            }else{
               encontrado=false;
           }
       }
       for (int i = 0; i < prestamoBiblioteca.listaEcientificos.size(); i++) {
           if(idPrestamo.equals(prestamoBiblioteca.listaEcientificos.get(i).getId())){
                encontrado=true;
                listaPrestamos.add(prestamoBiblioteca.listaEcientificos.get(i));
               System.out.println("Alquiler realizado con éxito\n");
            }else{
               encontrado=false;
           }
       }
       
       
   }
   public void listaPrestamos(){
       System.out.println(listaPrestamos.toString());
   }
    public ArrayList<Documentos> getListaPrestamos() {
        return listaPrestamos;
    }
   
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido;
    }
    
}
