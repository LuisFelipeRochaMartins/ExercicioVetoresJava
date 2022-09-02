import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float height[] = new float[29];
        int age[] = new int[29];
        float sum = 0;
        int students = 0;

        for (int i = 0; i < 29; i++) {
            System.out.print("Informe sua idade");
            age[i] = entrada.nextInt();
            int ages = entrada.nextInt();

            while (ages < 1 || ages > 100) {
                System.out.print("Idade inválida, favor insira novamente: ");
                age[i] = entrada.nextInt();

            }
            System.out.print("Informe sua altura");
            height[i] = entrada.nextFloat();
            float heights = height[i];

            while (heights < 0 || heights > 2.2)
                sum += height[i];
        }
        float average = (sum / 30);
        for (int k = 0; k < 29; k++) {
            if (age[k] > 13 && height[k] < average) {
                students += 1;
            }
            System.out.println("A quantidade de alunos maiores de 13 e " +
                    "\n com altura menor que a média é de: " + students);
        }
        entrada.close();
    }
}