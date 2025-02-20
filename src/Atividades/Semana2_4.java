package Atividades;
import java.util.Scanner;

public class Semana2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo produto: ");
        double valor2 = scanner.nextDouble();

        double multiplicacao = valor1 * valor2;

        System.out.println("Soma: " + multiplicacao);

        scanner.close();
    }

}