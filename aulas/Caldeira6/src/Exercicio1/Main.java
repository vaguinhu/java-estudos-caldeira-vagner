package Exercicio1;

import java.util.Stack;

class Livro {
    private String titulo;
    private String categoria;

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;

    }

    public String getCategoria() {
        return categoria;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Livro> pilhaLivros = new Stack<>();

        // Inicializando a pilha com alguns livros
        pilhaLivros.push(new Livro("Livro 1", "Ficção"));
        pilhaLivros.push(new Livro("Livro 2", "Romance"));
        pilhaLivros.push(new Livro("Livro 3", "Fantasia"));

        // Imprimindo os elementos da pilha
        System.out.println("Elementos da pilha:");
        for (Livro livro : pilhaLivros) {
            System.out.println("Título: " + livro.getTitulo() + ", Categoria: " + livro.getCategoria());
        }

        // Imprimindo os elementos da pilha com base na categoria
        System.out.println("Elementos da pilha com base na categoria 'Romance':");
        for (Livro livro : pilhaLivros) {
            if (livro.getCategoria().equals("Romance")) {
                System.out.println("Título: " + livro.getTitulo() + ", Categoria: " + livro.getCategoria());
            }
        }

        // Removendo os elementos da pilha até que ela esteja vazia
        System.out.println("Removendo elementos da pilha:");
        while (!pilhaLivros.isEmpty()) {
            Livro livroRemovido = pilhaLivros.pop();
            System.out.println("Livro removido - Título: " + livroRemovido.getTitulo() + ", Categoria: " + livroRemovido.getCategoria());
        }
    }
}