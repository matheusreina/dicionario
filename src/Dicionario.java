import java.util.HashMap;

public class Dicionario {
    static HashMap<String, String> dicionario = new HashMap<>();

    public static void main(String[] args) {
        // Adicionar palavras (linguagens de programação)
        adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        adicionarPalavra("TypeScript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        adicionarPalavra("Kotlin", "Linguagem moderna de programação para a JVM.");
        System.out.println("-----------------------------------------");
        exibirPalavras();
        System.out.println("-----------------------------------------");
        removerPalavra("Kotlin");
        exibirPalavras();
        System.out.println("-----------------------------------------");
        pesquisarPorPalavra("Java");
        System.out.println("-----------------------------------------");

    }

    static void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    static void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    static void exibirPalavras() {
        System.out.println(dicionario);
    }

    static void pesquisarPorPalavra(String palavra) {
        System.out.println(dicionario.get(palavra));
    }

}