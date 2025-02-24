package Atividades;

import java.util.Scanner;

public class Semana3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

       if(num1 > num2){
           System.out.println("O número 1 é o maior.");
       } else {
           System.out.println("O número 2 é o maior");
       }
        scanner.close();
    }
}
