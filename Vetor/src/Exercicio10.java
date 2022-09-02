import java.util.Scanner;
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma data no formato dd/mm/aaaa");
        String data = entrada.nextLine();

        int[] date = new int[3];
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);
        date[0]=diaInt;
        date[1]=mesInt;
        date[2]=anoInt;


        if (diaInt > 31 || diaInt < 1) {
            System.out.println("Dia inválido");
        } else if (mesInt > 12 || mesInt < 1) {
            System.out.println("Mês inválido");
        } else if (anoInt < 1) {
            System.out.println("Ano inválido");
        } else if (mesInt == 2 && diaInt > 29) {
            System.out.println("Dia inválido");
        } else if (mesInt == 2 && diaInt == 29 && anoInt % 4 != 0 && anoInt % 100 != 0 && anoInt % 400 != 0) {
            System.out.println("Dia inválido");
        } else {
            System.out.println("Data válida");
        }
            for (int i = 0; i <3; i++) {
                System.out.println(date[i]);
            }
            entrada.close();
    }
}
