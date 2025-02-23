package Atividades;
import java.util.Scanner;

public class Semana2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor por hora: ");
        double valorHora = scanner.nextDouble();

        // Cálculo do salário
        double salario = horasTrabalhadas * valorHora;

        // Exibindo o resultado
        System.out.printf("O funcionário %s trabalhou %d horas, e portanto possui R$ %.2f a receber.\n", nome, horasTrabalhadas, salario);

        // Fechar o scanner
        scanner.close();
    }
}
