/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadbiblioteca;




/**
 *
 * @author uvemo
 */
public class Documentos {
    
    protected String id;
    protected String nombre;
    protected String editorial;
    protected String autor;
    protected int fecha;

    public Documentos() {
    }

    public Documentos(String id, String nombre, String editorial, String autor, int fecha) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.fecha = fecha;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setNomnbre(String nomnbre) {
        this.nombre = nomnbre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    public String getId() {
        return id;
    }

    public String getNomnbre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getFecha() {
        return fecha;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return null;
    
    }

   
   
}
