package aulas.heranca.atividade;

public class ArarinhaAzul extends Animal {
    private double tamanhoDasAsas;

    public double getTamanhoDasAsas() {
        return tamanhoDasAsas;
    }

    public void setTamanhoDasAsas(double tamanhoDasAsas) {
        this.tamanhoDasAsas = tamanhoDasAsas;
    }

    public void voar() {
        System.out.println("A Ararinha Azul levantou voo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A Ararinha Azul está cantando alto!");
    }

    @Override
    public void comer() {
        System.out.println("A Ararinha Azul está comendo sementes.");
    }
}