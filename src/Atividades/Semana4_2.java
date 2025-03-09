package Atividades;

public class Semana4_2 {
    public static void main(String[] args) {
        class AreaVerde {
            private String statusConservacao;
            private String responsavel;

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
        }

        class MonitoramentoResiduos {
            private String statusColeta;
            private String responsavelColeta;

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
        }

        class Main {
            public void main(String[] args) {
                AreaVerde areaVerde = new AreaVerde();
                MonitoramentoResiduos residuos = new MonitoramentoResiduos();

                areaVerde.setStatusConservacao("Bom");
                areaVerde.setResponsavel("João");

                residuos.setStatusColeta("Concluída");
                residuos.setResponsavelColeta("Maria");

                System.out.println("Área Verde - Status de Conservação: " + areaVerde.getStatusConservacao());
                System.out.println("Área Verde - Responsável: " + areaVerde.getResponsavel());
                System.out.println("Monitoramento de Resíduos - Status da Coleta: " + residuos.getStatusColeta());
                System.out.println("Monitoramento de Resíduos - Responsável pela Coleta: " + residuos.getResponsavelColeta());
            }
        }


    }
}
