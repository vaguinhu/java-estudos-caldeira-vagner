import java.util.Scanner;

// 1º exercicio - Crie um programa que leia seu nome e imprima na tela.

public static void main(String[] args) {
        // Instancia um objeto da classe Scanner para podermos interagir com o terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        // Lê a entrada do usuário e associa a variável 'name' do tipo String para usarmos depois
        String name = scanner.nextLine();
        System.out.println("O nome digitado é: " + name);

        //Boa prática: Sempre fechar o Scanner
        scanner.close();
    }

}

//2º exercicio - Crie um programa que receba 2 números e imprima na tela.

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

    // Solicitar ao usuário que insira os três números
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Digite seu primeiro numero: ");
    
    double numero1 = scanner.nextDouble();
    
    System.out.println("Digite seu segundo numero: ");
    
    double numero2 = scanner.nextDouble();

    // Imprimir os resultados
    System.out.println("Voce digitou os numeros " + numero1 + " e " + numero2);
    
    scanner.close();
    }
}

//3º Exercício - Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        
        // Encontrar o maior número
        double maior = Math.max(Math.max(numero1, numero2), numero3);
        
        // Encontrar o menor número
        double menor = Math.min(Math.min(numero1, numero2), numero3);
        
        // Calcular a média aritmética
        double media = (numero1 + numero2 + numero3) / 3.0;
        

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
        
        scanner.close();
    }
}

//4º Exercício - Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, 
calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir o valor do salário mínimo
        double salarioMinimo = 1320.0;
        
        // Solicitar ao usuário que insira o valor do salário
        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();
        
        // Calcular a quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        
        // Imprimir o resultado
        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
        
        scanner.close();
    }
}

//5º Exercício - Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, 
determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o horário
        System.out.print("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos (0-59): ");
        int minuto = scanner.nextInt();

        System.out.print("Digite os segundos (0-59): ");
        int segundo = scanner.nextInt();

        // Validar se o horário está dentro dos limites
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Horário inválido.");
        } else {
            // Calcular a quantidade de segundos desde a meia-noite
            int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;

            // Calcular a quantidade de segundos que faltam para a meia-noite
            int segundosAteMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

            // Exibir os resultados
            System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite + " segundos.");
            System.out.println("Segundos que faltam para a meia-noite: " + segundosAteMeiaNoite + " segundos.");
        }

        scanner.close();
    }
}

//6º Exercício - Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
Se for menor de 16 anos, avisar que não pode votar;
Se tiver 16 ou 17, avisar que o voto é facultativo;
Se tiver mais de 65, avisar que também é facultativo o voto;
De 18 até 65, é obrigatório votar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira sua idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verificar as condições e imprimir a resposta adequada
        if (idade < 16) {
            System.out.println("Você não pode votar, pois é menor de 16 anos.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("O voto é facultativo para você.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Você é obrigado a votar.");
        } else {
            System.out.println("O voto é facultativo para você, pois você tem mais de 65 anos.");
        }

        scanner.close();
    }
}

//7º Exercício - Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário. 
A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira sua idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Solicitar ao usuário que insira seu salário
        System.out.print("Digite o seu salário (em reais): ");
        double salario = scanner.nextDouble();

        // Verificar se a pessoa pode comprar um automóvel
        if (idade >= 18 && salario > 2000) {
            System.out.println("Você pode comprar um automóvel.");
        } else {
            System.out.println("Você não pode comprar um automóvel.");
        }

        scanner.close();
    }
}

//8º Exercício - Criar um algoritmo para definir as filas prioritárias. 
Seu programa deve exibir um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. 
Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de filas prioritárias!");

        // Solicitar ao usuário que selecione sua condição
        System.out.println("Selecione sua condição:");
        System.out.println("1 - Gestante");
        System.out.println("2 - Idosa");
        System.out.println("3 - Pessoa com Deficiência (PCD)");
        System.out.println("4 - Nenhuma das alternativas");
        System.out.print("Digite o número correspondente à sua condição: ");
        
        int escolha = scanner.nextInt();
        
        // Verificar a escolha do usuário e determinar o direito à fila prioritária
        switch (escolha) {
            case 1:
                System.out.println("Você tem direito à fila prioritária por ser Gestante.");
                break;
            case 2:
                System.out.println("Você tem direito à fila prioritária por ser Idosa.");
                break;
            case 3:
                System.out.println("Você tem direito à fila prioritária por ser Pessoa com Deficiência (PCD).");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma das opções válidas.");
        }

        scanner.close();
    }
}

//9º Exercício - Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e, em seguida, calcule e exiba a idade.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o ano de nascimento
        System.out.print("Digite o seu ano de nascimento (AAAA): ");
        int anoNascimento = scanner.nextInt();

        // Obter o ano atual
        int anoAtual = LocalDate.now().getYear();

        // Calcular a idade
        int idade = anoAtual - anoNascimento;

        // Exibir a idade calculada
        System.out.println("Sua idade é: " + idade + " anos.");

        scanner.close();
    }
}

10º Exercício - Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus Celsius e, em seguida, 
converta essa temperatura em graus Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular a temperatura em graus Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibir o resultado
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + "°F");

        scanner.close();
    }
}

//11º Exercício - Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira uma palavra ou frase
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase(); // Converter para minúsculas para facilitar a contagem

        int contadorVogais = 0;

        // Percorrer o texto e contar as vogais
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        // Exibir o número de vogais
        System.out.println("O número de vogais na palavra/frase é: " + contadorVogais);

        scanner.close();
    }
}

//12º Exercício - Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais. 
Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual. Em seguida, calcule e exiba o valor convertido.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a quantia em dólares
        System.out.print("Digite a quantia em dólares: ");
        double quantiaEmDolares = scanner.nextDouble();

        // Solicitar ao usuário que insira a taxa de câmbio
        System.out.print("Digite a taxa de câmbio atual (por exemplo, para EUR, use 0.85): ");
        double taxaDeCambio = scanner.nextDouble();

        // Calcular o valor convertido
        double valorConvertido = quantiaEmDolares * taxaDeCambio;

        // Exibir o valor convertido
        System.out.println("O valor convertido é: " + valorConvertido);

        scanner.close();
    }
}

//13º Exercício - Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário. 
O fatorial de um número N é o produto de todos os inteiros de 1 até N.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro não negativo
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        // Verificar se o número é não negativo
        if (numero < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            // Calcular o fatorial
            long fatorial = calcularFatorial(numero);

            // Exibir o resultado
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }

    // Método para calcular o fatorial
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}

