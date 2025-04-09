package Candidatos;

public class Radio extends Candidatura {
    private int votosRadio;
    private static  final int VOTOS_RADIO = 200000;

    public Radio( String nombre, int votosRadio){
        super(nombre);
        this.votosRadio = 0;

    }
    public void votar(){
        votosRadio++;
        (System.out.print("Apoyados en Radio: "+ nombre);

    }
    @Override
    public int getVotosRadio(){
        return votosRadio;

    }
    @Override
    public int calcularCostos(){
        return votosRadio * COSTO_RADIO;

    }
    @Override
    public void vaciarUrnas(){
        votosRadio = 0;
        System.out.print("Votos eliminados en Radio: "+ nombre);

    }


}

