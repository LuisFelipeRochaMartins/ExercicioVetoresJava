import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont =0;
        float[] medias = new float[10];

        for(int i=0;i<10;i++){
            float sum =0;
            for (int k =0;k<=3;k++) {
                if (k==0){
                    System.out.print("Informe sua nota: ");
                    float nota = entrada.nextFloat();
                    sum+=nota;

                }else{
                    System.out.print("Informe outra nota: ");
                    float nota = entrada.nextFloat();
                    sum+=nota;
                }
                if (sum>=7){
                    cont+=1;
                }
            }
            medias[i]=sum;
        }
        System.out.println("A quantidade de alunos com média acima de 7 é:"+cont);
        entrada.close();
    }
}
