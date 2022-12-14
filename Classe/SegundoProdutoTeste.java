package Classe;

public class SegundoProdutoTeste {
    public static void main(String[] args) {

        SegundoProduto p1 = new SegundoProduto("Notebook", 4356.89, 0.25);

        SegundoProduto p2 = new SegundoProduto("Smartphone", 1899.90, 0.29);

        double precoFinal1 = p1.precoComDesconto(0.0);
        double precoFinal2 = p2.precoComDesconto(0.0);
        double valorCarrinho = (precoFinal1 + precoFinal2);

        System.out.println("Nome: " + p1.nome + "\nValor final: " + p1.precoComDesconto(0.1));
        System.out.println("Nome: " + p2.nome + "\nValor final: " + p2.precoComDesconto(0.0));
        System.out.println("Média do carrinho = R$" + valorCarrinho);
    }
}