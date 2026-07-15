package atividade.atividade4;

import java.util.Scanner;

public class ConstrutorEscadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int degraus = '1';
        char simbolo = '#';

        for (int x=0;x<=10;x++){
            for (int y=0;y<10;y++){
                System.out.print(simbolo+" ");
            }
            System.out.print("\n"+simbolo+" ");
        }
    }
}