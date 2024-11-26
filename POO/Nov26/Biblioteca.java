package POO.Nov26;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();


    public void catalogoDeLibros(){
        System.out.println("Catalogo de Libros");
        for (Libro libro : libros) {
           libro.mostrarInformacion();
        }
    }
    public void addLibro(){

        System.out.println("Vamos a agregar nuevos libros");
        System.out.println("Ingrese el titulo del libro: ");
        Scanner sc = new Scanner(System.in);

        String titulo = sc.nextLine();
        System.out.println("Ingrese el numero de paginas del libro: ");
        int paginas = sc.nextInt();
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.next();
        int existencias = 1;
        libros.add(new Libro(autor, titulo, paginas, existencias));

    }
    public void prestarLibro(){
        System.out.println("Ingrese el nombre del libro que quieras pedir prestado: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        for(Libro libro : libros){

            if(libros.contains(libro) && libro.getTitulo().equals(nombre)){
                libro.prestar();
            }
        }

    }
    public void devolverLibro(){
        System.out.println("Ingrese el nombre del libro que quieras devolver: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        for(Libro libro : libros){
            if(libro.getPrestado()) {
                if (libros.contains(libro) && libro.getTitulo().equals(nombre)) {
                    libro.devolver();
                }
            }
        }
    }

}
