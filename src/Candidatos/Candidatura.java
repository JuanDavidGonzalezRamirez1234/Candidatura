package Candidatos;

public class Candidatura {
    protected String nombre;

    public Candidatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalVotos() {
        return 0;
    }

    public int calcularCosto() {
        return 0;
    }

    public void vaciarUrnas() {

    }
}