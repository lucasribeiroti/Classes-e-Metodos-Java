package Classe.Desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 9;
        data1.mes = 3;
        data1.ano = 1999;

        var data2 = new Data();
        data2.dia = 26;
        data2.mes = 11;
        data2.ano = 2001;

        System.out.println(data1.dia + "/" + data1.mes + "/" + data1.ano);
        System.out.println(data2.dia + "/" + data2.mes + "/" + data2.ano);
    }
}
