package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Smartphone";
        p2.preco = 1899.90;
        p2.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto(0.0);
        double precoFinal2 = p2.precoComDesconto(0.0);
        double valorCarrinho = (precoFinal1 + precoFinal2);

        System.out.println("Nome: " + p1.nome + "\nValor final: " + p1.precoComDesconto(0.1));
        System.out.println("Nome: " + p2.nome + "\nValor final: " + p2.precoComDesconto(0.0));
        System.out.println("Média do carrinho = R$" + valorCarrinho);
    }
}