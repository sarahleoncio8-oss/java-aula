package atividade.atividade4;

public class Bugs {

public static void main(String[] args) {

    // arrumei o nome da variável pq no Java não pode começar com número, mudei para valor1
    int valor1 = 10;

    // ponto e vírgula aqui no final
    int contador = 5;

    //coloquei um ", 3" aqui para repetir 3 vezes.
    exibirMensagens("Bem-vindo ao sistema", 3);

    while (contador > 0) {
        System.out.println("Iniciando em: " + contador);

        //while estava num loop infinito pq o contador era sempre 5 e nunca diminuía, coloquei um contador para ele ir caindo até chegar no zero.
        contador--;
    }
}

        // ele só consegue chamar outros métodos se eles também forem static.
public static void exibirMensagens(String texto, int repeticoes) {
    for (int i = 0; i < repeticoes; i++) {
        System.out.println(texto);
    }
}
}