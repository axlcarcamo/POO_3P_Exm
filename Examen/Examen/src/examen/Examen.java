/*
Universidad Tecnologica de Honduras
Catedratico      : Ing Walter Suazo.
Alumno           : Axel R. Carcamo.
Numero de cuentas: 201910060114
Examen           : 3 Parcial

*/

package examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.io.FileWriter;
import java.util.Scanner;


public class Examen {

    public static void main(String[] args) throws IOException {   
        
        FileWriter fichero = new FileWriter("/Users/axelcarcamo/Carcamo/UTH_POO/POO_3P_Exm/Examen/fichero.txt");
        
        Scanner td = new Scanner(System.in);
        int res = 1;
        while(res==1){
            menu();
            int opcion=td.nextInt();
            switch(opcion){
                case 1:
                    Trabajo t = new Trabajo();
                    llenarTrabajo();
                    break;
                case 2:
                    Formal f = new Formal();
                    llenarFormal();
                    break;
                case 3:
                    Deportivo De = new Deportivo();
                    llenarDeportivo();
                    break;
                case 4:
                    break;
            }
            System.out.println("desea seguir ingresando un cliente");
            res = td.nextInt();
        }
    }
    public static void menu(){
        System.out.println("       MENU  ");
        System.out.println("1.- Trabajo");
        System.out.println("2.- Formal");
        System.out.println("3.- Deportivo");
        System.out.println("4.- salir");
    
    }
    
    public static void llenarTrabajo(){
    
    }
    
    public static void llenarFormal(){
    }
    
    public static void llenarDeportivo(){
    
    }
    
}
