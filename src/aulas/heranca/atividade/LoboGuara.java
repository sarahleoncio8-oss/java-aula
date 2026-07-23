package aulas.heranca.atividade;

public class LoboGuara extends Animal {
    private String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public void correrPeloCerrado() {
        System.out.println("O Lobo Guará está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Lobo Guará está uivando no cerrado!");
    }

    @Override
    public void comer() {
        System.out.println("O Lobo Guará está comendo pequenos frutos e carne.");
    }
}