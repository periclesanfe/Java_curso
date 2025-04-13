public class PromocaoAutomatica {   
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A';
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        int resultado = a + b; // byte + short = int
        System.out.println("Resultado da soma de byte e short: " + resultado);
        System.out.println(c);
        double resultado2 = a + b + c + d + e + f + g; // byte + short + char + int + long + float + double = double
        System.out.println("Resultado da soma de byte, short, char, int, long, float e double: " + resultado2);
    }
}