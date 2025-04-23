package somarNumerosInteirosPositivos;

public class SomarNumerosInteirosPositivos {

    public static int somaNumerosInteiroPositivo(int i) {
        var soma = 0;
        do { if (i>0) {soma += i; i--;} }
        while (i > 0);
        return soma;
    }
    public static void main(String[] args) {
        int i = 10;
        System.out.println("A soma dos números inteiros positivos de 1 a " + i + " é: " + somaNumerosInteiroPositivo(i));
    }
}
