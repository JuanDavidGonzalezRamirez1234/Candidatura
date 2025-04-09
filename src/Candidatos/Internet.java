package Candidatos;

public class Internet extends Candidatura {
    private int votosInternet;
    private static final int COSTO_INTERNET = 700000;

    public Internet(String nombre) {
        super(nombre);
        this.votosInternet = 0;
    }

    public void votar() {
        votosInternet++;
        System.out.println("Voto registrado por Internet para " + nombre);
    }

    @Override
    public int getTotalVotos() {
        return votosInternet;
    }

    @Override
    public int calcularCosto() {
        return votosInternet * COSTO_INTERNET;
    }

    @Override
    public void vaciarUrnas() {
        votosInternet = 0;
        System.out.println("Votos de Internet eliminados para " + nombre);
    }
}