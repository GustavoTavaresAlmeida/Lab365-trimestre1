package Atividades;
import java.util.Date;

public class Semana4_4 {
    public static void main(String[] args) {
        class AreaVerde {
            private String nome;
            private String localizacao;
            private double tamanho;

            public AreaVerde(String nome, String localizacao, double tamanho) {
                this.nome = nome;
                this.localizacao = localizacao;
                this.tamanho = tamanho;
            }

            public void exibirInformacoes() {
                System.out.println("Área Verde: " + nome);
                System.out.println("Localização: " + localizacao);
                System.out.println("Tamanho: " + tamanho + " metros quadrados");
            }
        }
        class MonitoramentoResiduos {
            private String tipoResiduo;
            private double quantidade; // em kg
            private Date dataColeta;

            public MonitoramentoResiduos(String tipoResiduo, double quantidade, Date dataColeta) {
                this.tipoResiduo = tipoResiduo;
                this.quantidade = quantidade;
                this.dataColeta = dataColeta;
            }

            public void exibirInformacoes() {
                System.out.println("Tipo de Resíduo: " + tipoResiduo);
                System.out.println("Quantidade: " + quantidade + " kg");
                System.out.println("Data da Coleta: " + dataColeta.toString());
            }
        }

    }
}
