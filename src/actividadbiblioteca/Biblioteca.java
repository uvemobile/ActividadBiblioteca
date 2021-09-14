
package actividadbiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uvemo
 */
public class Biblioteca {
    private String id;
    private String nombre;
    private String direccion;
    protected  ArrayList <Libro> listaLibros=new ArrayList();
    protected  ArrayList <Periodico> listaPeriodicos =new ArrayList();
    protected  ArrayList <Revista> listaRevistas =new ArrayList();
    protected  ArrayList <Ecientifico> listaEcientificos =new ArrayList();
    protected  ArrayList <Usuario> listaUsuarios =new ArrayList();

    public Biblioteca() {
    }

    public Biblioteca(String id, String nombre, String direccion) {
        this.listaLibros = new ArrayList();
        this.listaPeriodicos=new ArrayList();
        this.listaRevistas=new ArrayList();
        this.listaEcientificos=new ArrayList();
        this.listaUsuarios=new ArrayList();
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
   public void usuarioRegistrado(){
       Scanner dniRegistrado=new Scanner(System.in);
       System.out.println("Introduzca el dni registrado:");
       String dni=dniRegistrado.next();
       
       if (listaUsuarios.isEmpty()){
           System.out.println("No tiene acceso, no esta registrado.");
           nuevoUsuario();
       }else{
            for (int i = 0; i < listaUsuarios.size(); i++) {
                 if( dni.equals(listaUsuarios.get(i).getId())){
                    System.out.println("Usuario registrado!");
                }else{
                    System.out.println("No tiene acceso, no esta registrado.");
                    nuevoUsuario();
                    }
                }
            }
   }
   public void nuevoUsuario(){
       String id;
       String nombre;
       String apellido;
       boolean encontrado=false;
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduzca id del Usuario:");
       id=sc.next();
       System.out.println("Introduzca el nombre:");
       nombre=sc.next();
       System.out.println("Introduzca apellido:");
       apellido=sc.next();
       
       try {
           for (int i = 0; i < listaUsuarios.size(); i++) {
               if (listaUsuarios.get(i).getId().equals(id)) {
                   encontrado = true;
               }
           }   
               if (encontrado == true) {
                   System.out.println("Este usuario no se puede añadir porque ya existe...\n");
               } else {
                   System.out.println("El cliente se ha añadido con éxito\n");
                   Usuario usuario = new Usuario(id, nombre, apellido);
                   listaUsuarios.add(usuario);
               }
           
       } catch (Exception e) {
           e.getLocalizedMessage();
       }
   }
   public void getListaUsuarios(){
       if(listaUsuarios.isEmpty()){
           System.out.println("No hay ningún usuario registrado");
        }else{
           for (int i = 0; i < listaUsuarios.size(); i++) {
               System.out.println(listaUsuarios.get(i).toString());
           }
       }
       System.out.println("\n");
   }   
   public void alquilerUsuario(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Vuelva a introducir su id de usuario:");
       String idUsuario=sc.next();
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if(idUsuario.equals(listaUsuarios.get(i).getId())){
                    listaUsuarios.get(i).alquilarDocumento();
                }else{
                    System.out.println("No esta registrado");
                }
            }
           
       
       
   }
   public void getAlquilerUsuario(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Vuelva a introducir su id de usuario:");
       String idUsuario=sc.next();
       boolean encontrado=false;
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if(idUsuario.equals(listaUsuarios.get(i).getId())){
                    encontrado=true;
                    listaUsuarios.get(i).listaPrestamos();
                }else{
                    encontrado=false;
                    System.out.println("No hay ningún prestamo registrado");
                }
            }
           
       
       
   }
   
   public void setLibros(){
       Libro libro1=new Libro("l0001","Rey leon","Circulo","pepe",2021);
       Libro libro2=new Libro("l0002","coco","pinguins","luis",2020);
       Libro libro3=new Libro("l0003","Sirenita","anaya","jose",1999);
       Libro libro4=new Libro("l0004","Zorro","Circulo","ana",1995);
       Libro libro5=new Libro("l0005","Clean code","anaya","pedro",1987);
       listaLibros.add(libro1);
       listaLibros.add(libro2);
       listaLibros.add(libro3);
       listaLibros.add(libro4);
       listaLibros.add(libro5);
   }
   public void getLibros(){
       System.out.println("Lista de libros en la biblioteca:");
       try {
           for (int i = 0; i < listaLibros.size(); i++) {
               System.out.println(listaLibros.get(i).toString());
           }
       } catch (Exception e) {
           e.getLocalizedMessage();
       }
       System.out.println("\n");
   }
   
   public void setPeriodicos(){
       Periodico periodico1=new Periodico("P0001","El mundo","null","mundo",1960);
       Periodico periodico2=new Periodico("P0002","El pais","null","pais",2020);
       Periodico periodico3=new Periodico("P0003","Marca","null","jose",1999);
       Periodico periodico4=new Periodico("P0004","Confidencial","null","confidencial",1995);
       Periodico periodico5=new Periodico("P0005","ABC","null","abc",1987);
       listaPeriodicos.add(periodico1);
       listaPeriodicos.add(periodico2);
       listaPeriodicos.add(periodico3);
       listaPeriodicos.add(periodico4);
       listaPeriodicos.add(periodico5);
   }
   public void getPeriodicos(){
       System.out.println("Lista de Periodicos en la biblioteca:");
       try {
           for (int i = 0; i < listaPeriodicos.size(); i++) {
               System.out.println(listaPeriodicos.get(i).toString());
           }
       } catch (Exception e) {
           e.getLocalizedMessage();
       }
       System.out.println("\n");
   }
   
   public void setRevistas(){
       Revista revista1=new Revista("R0001","El jueves","Anaya","Paco p",2019);
       Revista revista2=new Revista("R0002","Hola","serix","mariateresa",1970);
       Revista revista3=new Revista("R0003","Saber vivir","dr.Ro","Paco porras",2019);
       Revista revista4=new Revista("R0004","Pelo pico pata","El vives","donald",1996);
       Revista revista5=new Revista("R0005","Jarra y pedal","tote","El tunas",2021);
       listaRevistas.add(revista1);
       listaRevistas.add(revista2);
       listaRevistas.add(revista3);
       listaRevistas.add(revista4);
       listaRevistas.add(revista5);
   }
   public void getRevistas(){
       System.out.println("Lista de Revistas en la biblioteca:");
       try {
           for (int i = 0; i < listaRevistas.size(); i++) {
               System.out.println(listaRevistas.get(i).toString());
           }
       } catch (Exception e) {
           e.getLocalizedMessage();
       }
       System.out.println("\n");
   }
   public void setEcientifico(){
       Ecientifico eCientifico1=new Ecientifico("E0001","Marte","saoix","ana mena",1869);
       Ecientifico eCientifico2=new Ecientifico("E0002","Luna","musk","salas",1894);
       Ecientifico eCientifico3=new Ecientifico("E0003","Universo","dr.Ro"," porras",1897);
       Ecientifico eCientifico4=new Ecientifico("E0004","Teorica de cuerdas","Sheldom","donald",1869);
       Ecientifico eCientifico5=new Ecientifico("E0005","Agujero negrol","elso","El tunas",1680);
       listaEcientificos.add(eCientifico1);
       listaEcientificos.add(eCientifico2);
       listaEcientificos.add(eCientifico3);
       listaEcientificos.add(eCientifico4);
       listaEcientificos.add(eCientifico5);
   }
   public void getEcientifico(){
       System.out.println("Lista de Estudios cientificos en la biblioteca:");
       try {
           for (int i = 0; i < listaEcientificos.size(); i++) {
               System.out.println(listaEcientificos.get(i).toString());
           }
       } catch (Exception e) {
           e.getLocalizedMessage();
       }
       System.out.println("\n");
   }
}
