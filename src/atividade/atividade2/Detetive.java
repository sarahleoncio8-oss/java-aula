package atividade.atividade2;

import java.util.Scanner;

public class Detetive {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero:");
        
        int numero = scanner.nextInt();

        if (numero % 2.0 == 0) {
            System.out.println("O número é Par.");
            if(numero < 0){
                System.out.println("O número é Negativo.");
            } else {
                System.out.println("O número é Positivo.");
            }
        } else if (numero % 2.0 != 0) {
            System.out.println("O número é Ímpar.");
            if(numero < 0){
                System.out.println("O número é Negativo.");
            } else {
                System.out.println("O número é Positivo.");
            }
        } 
        // else if (media < 5.0) { 
        //     System.out.println("Reprovado.");

        // } else if (media >= 5.0 && media <= 6.9) {
        //     System.out.println("Em Recuperação.");
        // }
  }
}