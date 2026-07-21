package atividade.atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class Dinamica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        String tarefa = "";

        while (!tarefa.equals("fim")) {

            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            tarefa = scanner.nextLine();

            if (!tarefa.equals("fim")) {
                tarefas.add(tarefa);
            }
        }

        System.out.println("Total de tarefas registradas: " + tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

    }
}