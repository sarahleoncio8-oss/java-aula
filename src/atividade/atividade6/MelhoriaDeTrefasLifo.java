package atividade.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MelhoriaDeTrefasLifo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.print("Deseja continuar? (Digite fim para parar): ");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")) {
                break;
            }
        }

        Collections.sort(tarefas);

        System.out.println("\nLista de tarefas em ordem alfabética:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        System.out.print("\nDigite a tarefa que deseja remover: ");
        String remover = entrada.nextLine();

        if (tarefas.remove(remover)) {
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }

        if (tarefas.size() > 0) {
            System.out.println("\nRemovendo a última tarefa (LIFO).");
            tarefas.remove(tarefas.size() - 1);
        }

        System.out.println("\nLista final de tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
}