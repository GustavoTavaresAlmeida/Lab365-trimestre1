package Atividades;
import java.util.Scanner;

public class Semana2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da circulo: ");
        double raio = scanner.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("A área da circulo é: " + area);

        scanner.close();
    }
}
