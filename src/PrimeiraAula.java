import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args){
        String nome;
        int idade;
        float altura;
        String cargo;
        String periodo;

        System.out.println("Digite seu nome: ");
        Scanner inome = new Scanner(System.in);
        nome = inome.nextLine();
        System.out.println(nome);

        System.out.println("Digite sua idade: ");
        Scanner iidade = new Scanner(System.in);
        idade = iidade.nextInt();
        System.out.println(idade);

        System.out.println("Digite sua altura: ");
        Scanner ialtura = new Scanner(System.in);
        altura = iidade.nextFloat();
        System.out.println(altura);

        System.out.println("Digite seu cargo: ");
        Scanner icargo = new Scanner(System.in);
        cargo = icargo.nextLine();
        System.out.println(cargo);

        System.out.println("Digite seu periodo: ");
        Scanner iperiodo = new Scanner(System.in);
        periodo = icargo.nextLine();
        System.out.println(periodo);

        System.out.println("nome: " + nome + "\n" + "idade: " + idade + "\n"+ "altura: " + altura + "\n" + "cargo: " + cargo + "\n" + "periodo: " + periodo);

    }
}