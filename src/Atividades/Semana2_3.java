package Atividades;
import java.util.Scanner;

public class Semana2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da circunferencia: ");
        double raio = scanner.nextDouble();

        double area = 3.14 * (raio +raio);

        System.out.println("A área da circunferência é: " + area);

        scanner.close();
    }
}
