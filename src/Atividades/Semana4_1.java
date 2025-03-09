package Atividades;

public class Semana4_1 {
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

            public String getNome() {
                return nome;
            }

            public String getLocalizacao() {
                return localizacao;
            }

            public double getTamanho() {
                return tamanho;
            }

            public void exibirInformacoes() {
                System.out.println("Área Verde: " + nome);
                System.out.println("Localização: " + localizacao);
                System.out.println("Tamanho: " + tamanho + " m²");
            }
        }

        class MonitoramentoResiduos {
            private String tipoResiduo;
            private double quantidade;
            private String dataColeta;

            public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
                this.tipoResiduo = tipoResiduo;
                this.quantidade = quantidade;
                this.dataColeta = dataColeta;
            }

            public String getTipoResiduo() {
                return tipoResiduo;
            }

            public double getQuantidade() {
                return quantidade;
            }

            public String getDataColeta() {
                return dataColeta;
            }

            public void exibirInformacoes() {
                System.out.println("Tipo de Resíduo: " + tipoResiduo);
                System.out.println("Quantidade: " + quantidade + " kg");
                System.out.println("Data da Coleta: " + dataColeta);
            }
        }

        class SistemaMonitoramento {
            public  void main(String[] args) {

                AreaVerde areaVerde1 = new AreaVerde("Parque Zoobotânico", "Centro de Joinville", 15000.0);
                AreaVerde areaVerde2 = new AreaVerde("Praça da Bandeira", "Centro Histórico de Joinville", 5000.0);

                MonitoramentoResiduos residuo1 = new MonitoramentoResiduos("Plástico", 20.5, "2025-03-01");
                MonitoramentoResiduos residuo2 = new MonitoramentoResiduos("Papel", 10.2, "2025-03-02");

                System.out.println("Informações das Áreas Verdes:");
                areaVerde1.exibirInformacoes();
                System.out.println();
                areaVerde2.exibirInformacoes();
                System.out.println();

                System.out.println("Informações sobre o Monitoramento de Resíduos:");
                residuo1.exibirInformacoes();
                System.out.println();
                residuo2.exibirInformacoes();
            }
        }
    }
}
