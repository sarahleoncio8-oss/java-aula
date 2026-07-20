package atividade.atividade7;

import java.util.Scanner;
import java.util.Arrays;

public class Temperaturas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[6];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª temperatura: ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        System.out.println("Temperaturas: " + Arrays.toString(temperaturas));
        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Menor temperatura: " + menor + "°C");

    }
}