package Atividades;

public class Semana4_5 {
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

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getLocalizacao() {
                return localizacao;
            }

            public void setLocalizacao(String localizacao) {
                this.localizacao = localizacao;
            }

            public double getTamanho() {
                return tamanho;
            }

            public void setTamanho(double tamanho) {
                this.tamanho = tamanho;
            }

            public void exibirInformacoes() {
                System.out.println("Área Verde: " + nome);
                System.out.println("Localização: " + localizacao);
                System.out.println("Tamanho: " + tamanho + " metros quadrados");
            }
        }

    }
}
