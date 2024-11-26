package POO.Nov26;

import java.time.Duration;
import java.time.LocalDate;

public class Libro extends ItemBiblioteca implements Catalogable{

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int existencias;
    private boolean prestado;



    public Libro(String titulo, String autor, int numeroPaginas, int existencias) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.existencias = existencias;
    }
    public Libro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void obtenerInformacion() {

    }

    @Override
    public void prestar() {
         if(this.existencias >= 1){
                System.out.println("El libro se puede prestar");
               this.existencias--;
               this.prestado = true;

            }
            else{
                System.out.println("El libro no se encuentra en la biblioteca");
            }


    }

    @Override
    public void devolver() {

        System.out.println("Gracias por devolver el libro :D");
        this.existencias++;
    }

    @Override
    public void calcularMultas(LocalDate fechaPrestamo) {
        Duration retraso = Duration.between(fechaPrestamo, LocalDate.now());
        int diasRetraso = (int)Math.ceil(retraso.getSeconds()/(3600*24));

        int multa = 200*diasRetraso;
        System.out.printf("Nos debes COP$ %d por tus %d días de retraso en la devolución de la revista %s", multa, diasRetraso, this.getTitulo());
    }

    public void mostrarInformacion(){
        System.out.println(this.getAutor() + " - " + this.getTitulo() + " - " + this.getNumeroPaginas() + " - " + this.getExistencias());
    }
}
