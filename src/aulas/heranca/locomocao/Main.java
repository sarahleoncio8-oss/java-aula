package aulas.heranca.locomocao;

public class Main {
    public static void main(String[]args){
        Veiculo veiculo = new Veiculo();
        Carro carro =  new Carro();
        Moto moto = new Moto();

        carro.nomeVeiculo = "Ferrari";
        System.out.println("O seu veiculo está sendo ligado");
    }
}
