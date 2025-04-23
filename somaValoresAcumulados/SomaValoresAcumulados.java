package somaValoresAcumulados;

public class SomaValoresAcumulados {
    public static void main(String[] args) {
        var soma = 0;
        for (var i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
