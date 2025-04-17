package numeroPar;

public class NumeroPar {
    public static void main(String[] args) {
        int numeroInteiro = 10;
        String resultado = (numeroInteiro % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " + resultado + ".");
    }
}