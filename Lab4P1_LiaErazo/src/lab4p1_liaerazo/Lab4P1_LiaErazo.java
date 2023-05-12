/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_liaerazo;
import java.util.Scanner;
/**
 *
 * @author Paola
 */
public class Lab4P1_LiaErazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("MENU");
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña mejorada");
            System.out.println("3.Salir");
            int opcion=leer.nextInt();
            switch(opcion){
                
                case 1 -> {
                    String A,B;
                    System.out.println("Ingrese el primer conjunto");
                    A=sc.next();
                    System.out.println("Ingrese el segundo conjunto");
                    B=sc.next();
                    if (A.equalsIgnoreCase(B)){
                        System.out.println("Ambos conjuntos son iguales");
                    }else{
                        System.out.println("Los conjutos son diferentes");
                        
                    }
                }//fin case 1
                
                case 2->{
                    String contra;
                    System.out.println("Ingrese la contraseña ");
                    contra=sc.next();
                    System.out.println("Ingrese un numero ");
                    int num=leer.nextInt();
                    boolean letra=false;
                    boolean numero=false;
                    if (contra.length()>=8){
                            for(int i=0;i<contra.length();i++){
                               char r=contra.charAt(i);
                                if(r>='a'&&r<='z'|| r<='A'&&r>='Z'){
                                 letra=true;   
                                }else{
                                 if(r>='0'&&r<='9'|| r<='9'&&r>='0'){
                                     numero=true;
                                }
                            }
                        }
                    }
                        System.out.println("La contraseña no es segura, tiene menos de 8 caracteres");
                }//fin case 2
                
                case 3->{
                    seguir=false;
                }//fin case 3
            }//fin switch
        }
    }
    
}
