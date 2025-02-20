package Atividades;
import java.util.Scanner;

public class Semana2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota + nota2 + nota3 + nota4) / 4;

        System.out.println("\n\n\n\nAluno: " + nome + "\nCom a média: " + media);

        if(media >= 7){
            System.out.println("Está aprovado");
        } else{
            System.out.println("Está reprovado");
        }

        scanner.close();
    }
}
