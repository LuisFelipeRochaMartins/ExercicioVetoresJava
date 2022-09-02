import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[4];
        float media = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.print("Digite sua nota: ");
            notas[i] = entrada.nextFloat();
            media+=notas[i];
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println("A nota " + i + " é: " + notas[i]);
        }
        for(int k =0;k<=3;k++){
            System.out.println("Nota "+k+1+": "+notas[k]);
        }
        System.out.println("O aluno teve média de "+media);
        entrada.close();
    }
}
