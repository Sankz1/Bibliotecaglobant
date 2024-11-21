package POO.Nov20;

import java.util.Scanner;

public class Main {
    static Jugador[] jugadores = new Jugador[11];
    static Equipo[] equipos = new Equipo[11];
    static int i = 0;
    static int e = 0;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc4 = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Ingrese una opcion: \n1)Crear jugador \n2)Crear equipo \n3)Mostrar Lista de Jugadores \n4)Mostrar lista de Equipos \n5)Asignar equipo a jugador \n6)Salir" );

            opcion = sc4.nextInt();
            switch (opcion) {
                case 1:
                    crearJugador();
                    break;
                case 2:crearEquipos();

                    break;
                case 3:
                    listaJugadores();
                    break;
                case 4: listarEquipos();
                    break;
                case 5: asignarEquipo();
                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 6);

    }
    public static void crearJugador(){
        Scanner sc = new Scanner(System.in);

         for (i = i+1; i<jugadores.length;i++) {
              jugadores[i] = new Jugador();

             System.out.println("Ingrese el nombre: ");
             String nombre = sc.nextLine();
             jugadores[i].setNombre(nombre);
             System.out.println("Ingrese la edad: ");
             int edad = sc.nextInt();
             jugadores[i].setEdad(edad);
             System.out.println("Ingrese el equipo de la siguiente lista: ");
             for (int j = 1; j < equipos.length; j++) {
                 if (equipos[j] != null) {
                     System.out.println("equipo " + j + ": " + equipos[j].getNombre());
                 }
                 else {
                     System.out.println( equipos[j]);
                 }
             }
             int opcionEquipo = sc.nextInt();
             if (equipos[opcionEquipo] == null) {
                 System.out.println("El equipo no existe");
             }
             else {
                 jugadores[i].setEquipo(equipos[opcionEquipo]);
             }
            break;
         }
    }

    public static void crearEquipos(){
        Scanner sc = new Scanner(System.in);
        for (e = e+1; e<equipos.length;e++) {
            if(equipos[e] != null) {
                System.out.println("El equipo ya existe");
            }
            else {
                equipos[e] = new Equipo();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                equipos[e].setNombre(nombre);

            }
            break;
        }
    }
    public static void listaJugadores(){
        for (int j = 1; j< jugadores.length;j++){
            if (jugadores[j]!= null) {
                System.out.print("Jugador: " + j + " ");
                System.out.print(jugadores[j].getNombre() + " ");
                System.out.print(jugadores[j].getEdad()+ " ");
                if (jugadores[j].getEquipo() != null) {
                    System.out.print(jugadores[j].getEquipo().getNombre() + " ");
                } else  {
                    System.out.println(jugadores[j].getEquipo());
                }

                System.out.println(" ");
            }
        }

    }
    public static void asignarEquipo(){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese el jugador al cual le asignara un equipo: ");
        listaJugadores();

        int  jugadorOpicon = sc.nextInt();

        System.out.println("Ingrese un equipo para asignarle al jugador");
        for (int j = 0; j < equipos.length; j++) {
            System.out.print("Equipo: " + j);
            if (equipos[j] != null) {
                System.out.println(equipos[j].getNombre() + " ");
            }
            else {
                System.out.println("Equipo " + j + ": " +  equipos[j]);
            }
        }
        int opcionEquipo = sc2.nextInt();
        jugadores[jugadorOpicon].setEquipo(equipos[opcionEquipo]);
    }
        public static void listarEquipos(){
            for (int j = 0; j < equipos.length; j++) {
                System.out.print("Equipo: " + j + " ");
                if (equipos[j] != null) {
                    System.out.println(equipos[j].getNombre() + " ");
                }
                else {
                    System.out.println("Equipo " + j + ": " +  equipos[j]);
                }
            }

        }


}
