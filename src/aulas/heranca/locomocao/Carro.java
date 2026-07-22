package aulas.heranca.locomocao;

public class Carro extends Veiculo{
    String cor;
    String categoria;
    String cambio;
    int quilometragem;

    public void ligarArCondicinado(){
        System.out.println("Ligando ar condicionado do meu carro");
    }
}
