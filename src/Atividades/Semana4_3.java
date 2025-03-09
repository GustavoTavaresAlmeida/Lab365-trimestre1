package Atividades;

public class Semana4_3 {
    public static void main(String[] args) {
        class AreaVerde {
            private String statusConservacao;
            private String responsavel;
            private double tamanhoEmMetrosQuadrados;

            public void setStatusConservacao(String status) {
                this.statusConservacao = status;
            }

            public String getStatusConservacao() {
                return this.statusConservacao;
            }

            public void setResponsavel(String responsavel) {
                this.responsavel = responsavel;
            }

            public String getResponsavel() {
                return this.responsavel;
            }

            public void setTamanhoEmMetrosQuadrados(double tamanho) {
                this.tamanhoEmMetrosQuadrados = tamanho;
            }

            public double calcularTamanhoEmHectares() {
                return this.tamanhoEmMetrosQuadrados / 10000;
            }

            public void exibirInformacoes() {
                System.out.println("Área Verde - Status de Conservação: " + this.statusConservacao);
                System.out.println("Área Verde - Responsável: " + this.responsavel);
                System.out.println("Área Verde - Tamanho: " + calcularTamanhoEmHectares() + " hectares");
            }
        }

        class MonitoramentoResiduos {
            private String statusColeta;
            private String responsavelColeta;
            private double residuosPorMes;

            public void setStatusColeta(String status) {
                this.statusColeta = status;
            }

            public String getStatusColeta() {
                return this.statusColeta;
            }

            public void setResponsavelColeta(String responsavel) {
                this.responsavelColeta = responsavel;
            }

            public String getResponsavelColeta() {
                return this.responsavelColeta;
            }

            public void setResiduosPorMes(double residuos) {
                this.residuosPorMes = residuos;
            }

            public double calcularResiduosPorMes() {
                return this.residuosPorMes;
            }

            public void exibirInformacoes() {
                System.out.println("Monitoramento de Resíduos - Status da Coleta: " + this.statusColeta);
                System.out.println("Monitoramento de Resíduos - Responsável pela Coleta: " + this.responsavelColeta);
                System.out.println("Monitoramento de Resíduos - Resíduos coletados por mês: " + calcularResiduosPorMes() + " kg");
            }
        }

        class Main {
            public void main(String[] args) {
                AreaVerde areaVerde = new AreaVerde();
                MonitoramentoResiduos residuos = new MonitoramentoResiduos();

                areaVerde.setStatusConservacao("Bom");
                areaVerde.setResponsavel("João");
                areaVerde.setTamanhoEmMetrosQuadrados(50000);

                residuos.setStatusColeta("Concluída");
                residuos.setResponsavelColeta("Maria");
                residuos.setResiduosPorMes(1200);

                areaVerde.exibirInformacoes();

                residuos.exibirInformacoes();
            }
        }

    }
}
