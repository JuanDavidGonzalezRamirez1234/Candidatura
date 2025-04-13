package Candidatos;

public class Television extends Candidatura {
    private int votosTelevision;
    private static final int COSTO_TELEVISION = 600000;

    public Television(String nombre) {
        super(nombre);
        this.votosTelevision = 0;
    }

    public void votar() {
        votosTelevision++;
        System.out.println("Voto registrado por Televisión para " + nombre);
    }

    @Override
    public int getTotalVotos() {
        return votosTelevision;
    }

    @Override
    public int calcularCosto() {
        return votosTelevision * COSTO_TELEVISION;
    }

    @Override
    public void vaciarUrnas() {
        votosTelevision = 0;
        System.out.println("Votos de Televisión eliminados para " + nombre);
    }
}