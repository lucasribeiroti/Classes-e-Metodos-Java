package Classe;

public class SegundoProduto {
    String nome;
    double preco;
    double desconto;

    SegundoProduto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto - descontoDoGerente);
    }
}