package Atividades;

public class Semana3_2 {
    public static void main(String[] args) {

        char[] vetor = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println("Vetor original:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            char temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("\nVetor invertido:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}
