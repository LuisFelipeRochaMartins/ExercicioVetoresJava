import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList senha = new ArrayList();
        Random alea = new Random();

        char[] conso = {'b','c','d','f','g','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        char[] vogal = {'a','e','i','o','u'};
        int i=1;
        System.out.print("Informe o tamanho da senha que deseja: ");
        int tam = entrada.nextInt();
            while (i<=tam){
                if(i%2==0){
                    senha.add(vogal[alea.nextInt(4)]);
                    i++;
                }
                if (i%2!=0) {
                    if(i==tam+1){
                        break;
                    }
                    senha.add(conso[alea.nextInt(20)]);
                    i++;
                }
            }
        System.out.print("Sua senha gerada é:"+senha);
        entrada.close();
    }
}
