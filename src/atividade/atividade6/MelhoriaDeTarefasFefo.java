package atividade.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MelhoriaDeTarefasFefo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<Integer> datas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.print("Digite a data (AAAAMMDD): ");
            datas.add(entrada.nextInt());
            entrada.nextLine();

            System.out.print("Deseja continuar? (Digite fim para parar): ");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")) {
                break;
            }
        }

        Collections.sort(tarefas);

        System.out.println("\nLista de tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        System.out.print("\nDigite a tarefa que deseja remover: ");
        String remover = entrada.nextLine();

        int posicao = tarefas.indexOf(remover);

        if (posicao != -1) {
            tarefas.remove(posicao);
            datas.remove(posicao);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }

        if (tarefas.size() > 0) {
            int menorData = datas.get(0);
            int indice = 0;

            for (int i = 1; i < datas.size(); i++) {
                if (datas.get(i) < menorData) {
                    menorData = datas.get(i);
                    indice = i;
                }
            }

            System.out.println("\nRemovendo a tarefa com a data mais próxima (FEFO).");
            tarefas.remove(indice);
            datas.remove(indice);
        }

        System.out.println("\nLista final:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
}