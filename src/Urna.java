/*
Se requiere calcular el porcentaje de votos que están en una urna.
Cada que se saca un boto de la urna, se ingresa el número del candidato.
Cuando se terminan los votos se ingresa un cero
 */

public class Urna {

    private int[] candidatos;
    private int totalVotos;

    public Urna(int numCandidatos){
        this.candidatos = new int[numCandidatos];
        this.totalVotos = 0;
    }

    public void registrarVoto(int candidato){
        if (candidato > 0 && candidato <= candidatos.length){
            candidatos[candidato - 1] += 1;
            totalVotos++;
        }
        else {
            System.out.println("Candidato no valido");
        }
    }

    public void mostrarResultado(){
        if (totalVotos == 0){
            System.out.println("No hubo votos");
        }
        for (int i = 0; i < candidatos.length; i++) {
            double porcentaje = candidatos[i] * 100.0 / totalVotos;
            System.out.printf("Candidato numero %d tiene %f %% de votos \n",(i + 1),porcentaje);
        }
    }


}