package aulas.heranca.atividade;

public class Zoologico {
    public static void main(String[] args) {
        LoboGuara meuLobo = new LoboGuara();
        meuLobo.setNome("Guará");
        meuLobo.setPeso(25.5);
        meuLobo.setSetorNoZoo("Setor do Cerrado");
        meuLobo.setCorDoPelo("Laranja e Preto");

        ArarinhaAzul minhaArara = new ArarinhaAzul();
        minhaArara.setNome("Blu");
        minhaArara.setPeso(1.2);
        minhaArara.setSetorNoZoo("Viveiro das Aves");
        minhaArara.setTamanhoDasAsas(1.1);

        meuLobo.emitirSom();
        minhaArara.comer();
    }
}