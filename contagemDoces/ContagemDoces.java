package contagemDoces;

public class ContagemDoces {
    public static void main(String[] args) {
        var contadorDoces = 1;
        var limiteDoces = Integer.parseInt(System.console().readLine("Quantos doces seu filho pode comer? "));
        while (contadorDoces <= limiteDoces) {
            System.out.println("você comeu " + contadorDoces + " doce(s)");
            if (contadorDoces == limiteDoces) {
                System.out.println("Você comeu todos os doces!");
                break;
            }
            contadorDoces++;
        }
    }   
}
