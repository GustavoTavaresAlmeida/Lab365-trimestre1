package Atividades;
import java.util.Scanner;
import java.util.Date;

public class Semana4_6 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Bem-vindo ao App Sustentabilidade!");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Registrar Área Verde");
                System.out.println("2 - Registrar Monitoramento de Resíduos");
                System.out.println("3 - Sair");


                boolean continuar = true;

                while (continuar) {
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome da área verde:");
                            String nomeArea = scanner.nextLine();

                            System.out.println("Digite a localização da área verde:");
                            String localizacao = scanner.nextLine();

                            System.out.println("Digite o tamanho da área verde (em metros quadrados):");
                            double tamanho = scanner.nextDouble();
                            scanner.nextLine();


                        case 2:
                            System.out.println("Digite o tipo de resíduo:");
                            String tipoResiduo = scanner.nextLine();

                            System.out.println("Digite a quantidade de resíduo (em kg):");
                            double quantidade = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Digite a data da coleta (dd/MM/yyyy):");
                            String dataString = scanner.nextLine();
                            Date dataColeta = new Date();

                        case 3:
                            continuar = false;
                            System.out.println("Obrigado por usar o App Sustentabilidade!");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }

                    if (continuar) {
                        System.out.println("\nEscolha uma opção:");
                        System.out.println("1 - Registrar Área Verde");
                        System.out.println("2 - Registrar Monitoramento de Resíduos");
                        System.out.println("3 - Sair");
                    }
                }

                scanner.close();

    }
}
