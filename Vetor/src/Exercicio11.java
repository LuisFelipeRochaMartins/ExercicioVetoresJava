import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um texto, mas ao invés de utilizar o espaço " +
                "\npara separar as palavras utilize o ponto e vírgula");
        String texto = entrada.nextLine();

        System.out.println(texto.replace(';', ' '));
        entrada.close();
    }
}
