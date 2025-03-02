package Atividades;
import java.util.Random;

public class Semana3_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Random rand = new Random();

        System.out.println("Matriz 3x3 com números aleatórios:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(101);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int maiorValor = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("\nO maior valor da matriz é: " + maiorValor);

    }
}