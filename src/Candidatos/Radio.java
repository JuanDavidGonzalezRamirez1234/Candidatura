package Candidatos;

public class Radio extends Candidatura {
    private int votosRadio;
    private static final int COSTO_RADIO = 200000;

    public Radio(String nombre) {
        super(nombre);
        this.votosRadio = 0;
    }

    public void votar() {
        votosRadio++;
        System.out.println("Voto registrado por Radio para " + nombre);
    }

    @Override
    public int getTotalVotos() {
        return votosRadio;
    }

    @Override
    public int calcularCosto() {
        return votosRadio * COSTO_RADIO;
    }

    @Override
    public void vaciarUrnas() {
        votosRadio = 0;
        System.out.println("Votos de Radio eliminados para " + nombre);
    }
}

