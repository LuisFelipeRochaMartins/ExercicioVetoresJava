import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int age[] = new int[4];
        float[] height = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe sua altura: ");
            height[i] = entrada.nextFloat();
            System.out.print("Informe sua idade: ");
            age[i] = entrada.nextInt();
        }
        for (int k = 0; k < 4; k++) {
            System.out.println("Idade da pessoa número "+k+" é igual à:"+age[k]);
            System.out.println("Peso da pessoa número "+k+" é igual à:"+height[k]);
            System.out.println();
        }
        entrada.close();
    }
}
