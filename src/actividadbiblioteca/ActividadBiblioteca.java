
package actividadbiblioteca;

import java.util.Scanner;

/**
 *
 * @author uvemo
 */
public class ActividadBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca biblioteca=new Biblioteca("B0001","Biblioteca Nacional","Paseo de la chopera");
        Scanner seleccion=new Scanner(System.in);
        int opcionSeleccionada;
        String dniRegistrado;

        do{
           menu1();
           System.out.println("Seleccione una operación a realizar:");
           opcionSeleccionada = seleccion.nextInt();
           switch(opcionSeleccionada){
               case 1 :{
                  // System.out.println("Introduzca el dni del usuario registrado:");
                   biblioteca.usuarioRegistrado();
                   
                   try {           
                        do {
                            menu();
                            System.out.println("Seleccione una operación a realizar:");
                            opcionSeleccionada = seleccion.nextInt();
                
                            switch (opcionSeleccionada) {
                                case 1: {
                                        
                                        biblioteca.setLibros();
                                        biblioteca.setPeriodicos();
                                        biblioteca.setRevistas();
                                        biblioteca.setEcientifico();
                                        biblioteca.getLibros();
                                        biblioteca.getPeriodicos();
                                        biblioteca.getRevistas();
                                        biblioteca.getEcientifico();
                                   break;
                                }
                                case 2 : {
                                        biblioteca.alquilerUsuario();
                    
                                     break;
                                }                                       
                    
                                case 3 : {
                                           biblioteca.getAlquilerUsuario();
                                   break;
                                }

                                case 4 :{
                                    System.out.println("Saliendo del programa...");
                                    break;
                                }
                     
                            }
                        } while (opcionSeleccionada != 4);
                    } catch (Exception e) {
                        System.out.println("toString(): " + e.toString());
                    }
                    
                   break;
               }
               case 2 :{
                     System.out.println("Necesita registrarse para acceder a la biblioteca");
                     biblioteca.nuevoUsuario();
                   break;
               }
               case 3 :{
                   System.out.println("Saliendo del programa...");
                   break;
               }
           }
           }while (opcionSeleccionada != 3);
    }     
        
    private static void menu1(){
        System.out.println("Esta registrado?");
        System.out.println(" [1] SI"); 
        System.out.println(" [2] NO"); 
        System.out.println(" [3] Salir del programa"); 
    }
    private static void menu(){
        System.out.println("Operaciones disponibles:");
        System.out.println(" [1] Ver todo tipo de documento para alquilar.");
        System.out.println(" [2] Alquilar documento");
        System.out.println(" [3] Ver documentos alquilados.");
        System.out.println(" [4] Salir del programa");
         
    }

}