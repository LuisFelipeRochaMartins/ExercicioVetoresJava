import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra, a = "A", e = "E", i = "I", o = "O", u = "U";
        ArrayList consoantes = new ArrayList<>();
        int cont = 0;
        for (int k = 0; k < 10; k++) {
            System.out.print("Digite uma letra");
            letra = entrada.nextLine();
            if (!(letra.equalsIgnoreCase(a)) && !(letra.equalsIgnoreCase(e)) && !(letra.equalsIgnoreCase(i)) && !(letra.equalsIgnoreCase(o)) && !(letra.equalsIgnoreCase(u))) {
                cont += 1;
                consoantes.add(letra);
            }
        }
        System.out.println("A quantidade de consoantes é: " + cont);
        System.out.println("As consoantes digitadas são: " + consoantes);
        entrada.close();
    }
}
