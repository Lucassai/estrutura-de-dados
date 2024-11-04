package ListaDeTarefas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        int entrada;
        String nome;
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        System.out.println("*****************************************************");
        System.out.println("\t1: Adicionar um novo Cliente na fila");
        System.out.println("\t2: Listar todos os Clientes na fila");
        System.out.println("\t3: Chamar (retirar) uma pessoa da fila");
        System.out.println("\t0: O programa deve ser finalizado. ");
        System.out.println("*****************************************************");

        do {
            System.out.println("\nEntre com a opção desejada: ");
            entrada = leia.nextInt();
            switch (entrada) {
                case 1:
                    System.out.println("Adicionar um novo Cliente na fila");
                    leia.skip("\\R?");
                    nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente adicionado");
                    break;
                case 2:
                    System.out.println("Listar todos os Clientes na fila");
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia");
                    } else {
                        System.out.println(fila);
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia");
                    } else {
                        System.out.println("Chamar (retirar) uma pessoa da fila");
                        System.out.println(fila.poll() + " foi chamado(a)!");
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


