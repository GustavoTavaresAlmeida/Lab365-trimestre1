package Atividades;
import java.util.ArrayList;

public class Semana3_5 {

    public static ArrayList<String> filtrarStringsComecandoCom(ArrayList<String> lista, char caractere) {
        // Criação da nova lista que será retornada
        ArrayList<String> resultado = new ArrayList<>();

        // Itera sobre cada string da lista original
        for (String str : lista) {
            // Verifica se a string não está vazia e se começa com o caractere fornecido
            if (!str.isEmpty() && str.charAt(0) == caractere) {
                // Adiciona a string na nova lista
                resultado.add(str);
            }
        }

        // Retorna a lista filtrada
        return resultado;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("abacaxi");
        listaDeStrings.add("banana");
        listaDeStrings.add("amigo");
        listaDeStrings.add("carro");
        listaDeStrings.add("aberto");

        // Chamando a função e passando a lista e o caractere desejado
        char caractere = 'a';
        ArrayList<String> resultado = filtrarStringsComecandoCom(listaDeStrings, caractere);

        // Exibindo o resultado
        System.out.println("Strings que começam com '" + caractere + "': " + resultado);
    }
}
