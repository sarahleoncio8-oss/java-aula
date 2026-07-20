//MELHORAR O ARQUIVO DE LISTA DE TAREFAS (Feito na Atividade 5)
//
//Criar um arquivo novo, numa pasta de Atividade6 e ele deve
//conter as seguintes melhorias de código:
//Ordenação de tarefas em ordem alfabetica/tadas
//Metodo para remover tarefas espefícicas
//> removerTarefas pelo metodo FIFO
//> removerTarefas pelo metodo FEFO
//> removerTarefas pelo metodo LIFO
//        (Opicional) Adicionar um metodo que registre
//as tarefas que foram concluídas

package aulas.exemplos.aula6;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefasDinamicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.println("Deseja continuar?");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("Total de tarefas registradas: "+tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i+1)+". "+tarefas.get(i));
        }
    }
}