import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[20];
        ArrayList par = new ArrayList<>();
        ArrayList impar = new ArrayList<>();

        for (int i =0;i<20;i++){
            System.out.print("Informe um valor: ");
            numeros[i]= entrada.nextInt();
            if (numeros[i]%2==0){
                par.add(numeros[i]);
            }else{
                impar.add(numeros[i]);
            }
        }
        System.out.print("Todos os números informados: ");
        for (int i=0;i<20;i++) {
            System.out.print(numeros[i]+", ");
        }
        System.out.println();
        System.out.println("Todos os números pares: "+par);
        System.out.println("Todos os números ímpares: "+impar);
        entrada.close();
    }
}
