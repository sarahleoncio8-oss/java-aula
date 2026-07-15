package atividade.atividade4;

import java.util.Scanner;

public class Cofre {

    public static void main(String[] args) {
        CofreDigital();
    }

    public static void CofreDigital() {
        Scanner leitor = new Scanner(System.in);

        int tentativas = 5;
        int codigoCorreto = 9999;

        while (tentativas > 0) {
            System.out.print("Digite a senha: ");
            int senhaDigitada = leitor.nextInt();

            if (senhaDigitada == codigoCorreto) {
                System.out.println("Cofre Aberto");
                break;
            } else {
                tentativas = tentativas - 1;

                if (tentativas > 0) {
                    System.out.println("Código Errado. Restam " + tentativas);
                } else {
                    System.out.println("Cofre Bloqueado");
                }
            }
        }
    }
}