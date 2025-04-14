package calculadoraSimples;

public class CalculadoraSimples {
    
    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

// Divisão de a por b (como um número de ponto flutuante).
    public static double divisao(int a, int b){
        if (b != 0) {
            return (double) a / b;       
        }
        return 0;
    }

    public static int resto(int a, int b){
        return a % b;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("Divisão: " + divisao(a, b));
        System.out.println("Resto: " + resto(a, b));
    }
}