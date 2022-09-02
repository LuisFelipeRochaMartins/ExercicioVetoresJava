import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva um texto: ");

        String texto = entrada.nextLine();
        int k = texto.length();
        char vetor[];

        vetor = texto.toCharArray();
        for (int i = 0; i < k; i++) {
            System.out.println("Texto: " + vetor[i]);
        }
        entrada.close();
    }

}