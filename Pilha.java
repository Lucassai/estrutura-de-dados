package ListaDeTarefas;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
    Stack<String> pilha = new Stack<>();
    int entrada;
    String livro;
    Scanner leia = new Scanner(System.in);

        System.out.println("*****************************************************");
        System.out.println("\t1: Adicionar um novo livro na pilha.");
        System.out.println("\t2: Listar todos os livros da Pilha.");
        System.out.println("\t3: Retirar um livro da pilha.");
        System.out.println("\t0: O programa deve ser finalizado. ");
        System.out.println("*****************************************************");
        do{
            System.out.println("\nEntre com a opção desejada: ");
            entrada = leia.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("Adicionar um novo livro na pilha.");
                    leia.skip("\\R?");
                    livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro adicionado");
                    break;
                case 2:
                    System.out.println("Listar todos os livros da Pilha");
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        System.out.println(pilha);
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        System.out.println("Chamar (retirar) um livro da pilha");
                        System.out.println(pilha.pop() + " foi chamado(a)!");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Resposta inválida");
                    break;
            }
        }
        while (entrada != 0);
        leia.close();
    }

}
