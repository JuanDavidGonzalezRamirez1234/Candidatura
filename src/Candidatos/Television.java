package Candidatos;

public class Television extends Candidatura {
    private int votosTelevision;
    private static  final int VOTOS_TELEVISION = 600000;

    public Television( String nombre){
        super(nombre);
        this.votosTelevision = 0;

    }
    public void votar(){
        votosTelevision++;
        (System.out.print("Apoyados en Television: "+ nombre);

    }
    @Override
    public int getVotosTelevision(){
        return votosInternet;

    }
    @Override
    public int calcularCostos(){
        return votosTelevision * COSTO_TELEVISION;

    }
    @Override
    public void vaciarUrnas(){
        votosTelevision = 0;
        System.out.print("Votos eliminados en Television: "+ nombre);

    }


}

