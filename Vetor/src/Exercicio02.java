
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<Double>();
        for(int i =0;i<10;i++) {
            System.out.print("Digite um valor: ");
            numeros.add(entrada.nextDouble());
        }
        numeros.sort(Comparator.reverseOrder());
        System.out.print("Vetor na ordem inversa "+numeros);
        entrada.close();
    }
}
