import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i =0;i<=5;i++){
            System.out.print("Informe um : ");
            numeros.add(entrada.nextInt());
        }
        System.out.println("Os números lidos foram: "+numeros);
        entrada.close();
    }
}