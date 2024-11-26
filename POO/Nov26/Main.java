package POO.Nov26;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Biblioteca biblioteca = new Biblioteca();
     int opcion = 0;
     do {
         System.out.println("ingrese una opcion: \n1)Agregar Libros \n2)Consultar libros \n3)Prestar Libros \n4)Devolver Libros");
         Scanner sc = new Scanner(System.in);
         opcion = sc.nextInt();
         switch (opcion){
             case 1:  biblioteca.addLibro();
             break;
             case 2: biblioteca.catalogoDeLibros();
             break;
             case 3: biblioteca.prestarLibro();
             break;
             case 4: biblioteca.devolverLibro();
             break;

         }
     } while (opcion != 5);



    }
}