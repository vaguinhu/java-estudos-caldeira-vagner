package Exercicio2;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criação do HashMap e inserção de algumas entradas
        Map<String, Integer> mapaIdades = new HashMap<>();
        mapaIdades.put("João", 30);
        mapaIdades.put("Maria", 40);
        mapaIdades.put("Pedro", 50);

        // Acessando e imprimindo a idade de um nome específico
        String nome = "Maria";
        if (mapaIdades.containsKey(nome)) {
            int idade = mapaIdades.get(nome);
            System.out.println("A idade de " + nome + " é " + idade + " anos.");
        } else {
            System.out.println("Não foi encontrada uma idade para o nome " + nome + ".");
        }

        // Método para imprimir nomes das pessoas que estão na terceira idade
        imprimirTerceiraIdade(mapaIdades);
    }

    public static void imprimirTerceiraIdade(Map<String, Integer> mapaIdades) {
        System.out.println("Pessoas na terceira idade:");
        for (Map.Entry<String, Integer> entry : mapaIdades.entrySet()) {
            String nome = entry.getKey();
            int idade = entry.getValue();
            if (idade >= 60) {
                System.out.println(nome);
            }
        }
    }
}
