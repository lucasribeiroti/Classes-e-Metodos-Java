package Classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto - descontoDoGerente);
    }
}
/*
Poderá ser passado também um método sem parâmetro, já que foi definido acima o preço e desconto.
Dessa forma ficaria:

double precoComDesconto() {
    return preco * (1 - desconto);
   }
 */