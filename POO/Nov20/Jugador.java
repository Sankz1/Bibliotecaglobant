package POO.Nov20;

public class Jugador {
    private String nombre;
    private int edad;
    private Equipo equipo;

    public Jugador(String nombre, int edad, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }
    public Jugador () {};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
