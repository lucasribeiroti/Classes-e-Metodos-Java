package Classe.Desafio;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        return (dia + "/" + mes + "/" + ano);  //return String.format("%d/%d/%d", dia, mes, ano);
    }
}
/*
void obterDataFormatada() {
    System.out.printf("%d/%d/%d", dia, mes, ano);
   }
 */