import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Urna urna = new Urna(10);

        int voto;

        do {
            System.out.println("Sistema de votacion");
            System.out.println("Ingresa el numero de candidato a votar:");
            System.out.println("0 para terminar la votacion");
            voto = sc.nextInt();

            if (voto != 0){
                urna.registrarVoto(voto);
            }
        }
        while (voto != 0);

        System.out.println("Votacion terminada  ");

        urna.mostrarResultado();
        sc.close();
    }
}
