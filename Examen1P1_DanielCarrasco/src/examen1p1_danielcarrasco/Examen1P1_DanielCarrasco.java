/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_danielcarrasco;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Examen1P1_DanielCarrasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Main donde llamamos el menú
        menu();
    }
    //METODOS
    public static void menu(){
        Scanner ninetales = new Scanner(System.in);
        //Siempre mi scanner es ninetales o variantes como nine, tales y otros, si se lo ven a alguien más posiblemente me copiaron >:(
        //Igual mi menú siempre trae 10 "-" de cada laso de la palabra
        //(int)cadena.charAt(i);
        System.out.println("Bienvenidx!");
        System.out.println("Este es mi examen de semana 5");
        System.out.println("A continuacion te muestro el menu");
        System.out.println("----------Menu----------");
        System.out.println("1-.Conjuntos");
        System.out.println("2-.Cifrado por substitución");
        System.out.println("3-.Sobre");
        System.out.println("4-. Salir");
        System.out.println("------------------------");
        System.out.println("Tome en cuenta que un numero mayor a 4 le saca del programa");
        int ejercicio= ninetales.nextInt();
        
        //DO para reperit hasta que no se cumpla el while
        do{
            
            switch (ejercicio){
                
                case 1:
                    conjuntos();
                    
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                case 2:
                   
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                case 3:
                    sobre();
                    
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                default:
                    ejercicio=10;
                    
                    break;
            }
            
        }while (ejercicio<4);
        //condicion
    
}
//Final del metodo menu
    //comentarios para no perderme
//Inicio del primer metodo
    public static void conjuntos(){
        Scanner nine = new Scanner(System.in);
        System.out.println("Solo pueden ser A o B, no invente usuario :|");
        System.out.println("Bienvenidx, ingrese el conjunto A");
        String conjuntoUno= nine.nextLine();
        System.out.println("ingrese el conjunto B");
        String conjuntoDos= nine.nextLine();
        //La verdad para hacer estas validaciones pense en el meme de "Donde está la chiquilla de la foto?"
        //Soy yo! pues no te pareces
        //Es que me puse un filtro ToT
        String A= "A={a,}";
        String B= "B={a,}";
        boolean aguacate;
        boolean tortilla;
        String union= "C={";
        String nueva= "";
        String nuevaD= "";
        String inter= "";
        int contador=0;
        
        //Validacion 1
        if (conjuntoUno.charAt(0)==A.charAt(0) && conjuntoUno.charAt(1)==A.charAt(1) && conjuntoUno.charAt(2)==A.charAt(2) && conjuntoUno.charAt(4)==A.charAt(4)){
             aguacate= true;   
        }else{
            aguacate=false;
        }
        //Validacion 2
        if (conjuntoDos.charAt(0)==B.charAt(0) && conjuntoDos.charAt(1)==B.charAt(1) && conjuntoDos.charAt(2)==B.charAt(2) && conjuntoDos.charAt(4)==B.charAt(4)){
            tortilla= true;   
        }else{
            tortilla=false;
        }
        //Ahora viene lo feo
        //Aqui vamos a ir haciendole el hechizo para ver si entramos o no
        String conjuntoDosC=conjuntoDos.replace("B", "A");
        if (tortilla==true && aguacate==true){
            if (conjuntoUno.equals(conjuntoDosC)){
                System.out.println("Ambos conjuntos son lo mismo");
                //Eso fue fácil, ahora si lo difícil.
            }else{
                System.out.println("eale");
                for (int i= 3; i < conjuntoUno.length(); i++) {
                    nueva= nueva+conjuntoUno.charAt(i);
                }
                for (int j = 3; j < conjuntoDosC.length(); j++) {
                    nuevaD= nuevaD+conjuntoDosC.charAt(j);    
                    }
                union=nueva+nuevaD;
                String unionFinal= union.replace("}", "");
                System.out.println("La union es: C={"+unionFinal+"}");
                //Inter
                if(conjuntoUno.length()>conjuntoDosC.length()){
                    for (int i = 3; i < conjuntoUno.length(); i++) {
                        for (int j = 3; j < conjuntoDosC.length(); j++) {
                            if (conjuntoUno.charAt(i)==conjuntoDosC.charAt(j)){
                                inter=inter+conjuntoDosC.charAt(i);
                            }
                            if (j<3 || j>conjuntoDosC.length()){
                                j++;
                            }
                        } 
                    }  
                }else if(conjuntoDosC.length()>conjuntoUno.length()){
                        for (int i = 3; i < conjuntoDosC.length(); i++) {
                            for (int j = 3; j < conjuntoUno.length(); j++) {
                                if (conjuntoDosC.charAt(i)==conjuntoDosC.charAt(j)){
                                    inter=inter+conjuntoDosC.charAt(i);
                                    
                                }
                                if (j<3 || j>conjuntoUno.length()){
                                    j++;
                                }
                            } 
                        }  
                    }
                //eale
                System.out.println("La intersección es: I={"+inter+"}");
                
            }
        }
        
    }
    //Inicio metodo
    
    public static void cifrado(){
        Scanner tal = new Scanner(System.in);
        System.out.println("Bienvenidx al cifrado, ingrese la cadena a cambiar: ");
        String cifrar= tal.nextLine();
        String cifrarL= cifrar.toLowerCase();
        String abc= "abcdefghijklmnopqrstvwxyz";
        String cifrado= "";
        
         for (int i = 0; i < cifrarL.length(); i++) {
             
             if (cifrarL.charAt(i)==abc.charAt(0)){
                 cifrado=cifrarL.replace("a", "z");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(1)){
                 cifrado=cifrarL.replace("b", "y");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(2)){
                 cifrado=cifrarL.replace("c", "x");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(3)){
                 cifrado=cifrarL.replace("d", "w");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(4)){
                 cifrado=cifrarL.replace("e", "v");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(5)){
                 cifrado=cifrarL.replace("f", "t");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(6)){
                 cifrado=cifrarL.replace("g", "s");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(7)){
                 cifrado=cifrarL.replace("h", "r");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(8)){
                 cifrado=cifrarL.replace("i", "q");
             }else if (cifrarL.charAt(i)==abc.charAt(9)){
                 cifrado=cifrarL.replace("j", "o");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(10)){
                 cifrado=cifrarL.replace("k", "n");
                 
             }else if (cifrarL.charAt(i)==abc.charAt(11)){
                 cifrado=cifrarL.replace("l", "m");  
             }
             //Se intentó
             
            
        }
         System.out.println("Cifrado es: "+cifrado);
    }
    
    
    //Inicio del metodo sobre
    public static void sobre(){
        Scanner tales = new Scanner(System.in);
        Scanner tal = new Scanner(System.in);
        System.out.println("Ingrese un numero entero y par");
        int numero= tales.nextInt();
        System.out.println("Ingrese con que quiere formar el sobre, ejemplo: *");
        String cosa=tal.nextLine();
        //SI SE PUDOOOOOO
        //Le puse los - para que no se vea feo
        System.out.println("--------------------");
        if (numero%2==0 && numero>0){
                for(int a=0; a<numero*2; a++){
                    for(int b=0; b<numero*2; b++){
                        if ((a==0)||(b==0) ||(a==b && a<numero)||(a+b<numero%2)||(a==numero*2-1)||(b==numero*2-1)||(numero*2-1-a==b&&numero<b)){
                            System.out.print(cosa);
                        }else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println("");
                }
        }else{
            System.out.println("Ingresaste un numero que no es par o mayor a 0");
        }
        System.out.println("--------------------");
    }
    
}

