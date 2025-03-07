package Exercicios_aula;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[3];
        // valores[10, 20, 30]
        String[] nomes = new String[3];

        // double notas = new double[4]; -> Gera um erro de tipo incompativel

        //inicializando vetores
        double[] notas = {4.5, 5.6, 9.5};
        boolean[] valores_logicos = {true, false, true, false};

        System.out.println(notas[0]);

        notas[0] = 7;

        System.out.println(notas[0]);

        System.out.print("Nome do usuário: ");

    }
}
