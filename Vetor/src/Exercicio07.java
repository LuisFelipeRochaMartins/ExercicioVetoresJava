import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sum =0;
        int sump=1;
        int[] numeros = new int[4];

        for(int i=0;i<4;i++){
            System.out.print("Informe um número inteiro: ");
            numeros[i] = entrada.nextInt();
            sum+=numeros[i];
            sump*=numeros[i];
        }
        System.out.print("Os valores que existem nesse vetor são: ");
        for(int k=0;k<4;k++){
            System.out.print(numeros[k]);
        }
        System.out.println();
        System.out.println("A soma desse vetor é: "+sum);
        System.out.println("O produto desse vetor é: "+sump);

        entrada.close();
    }
}
