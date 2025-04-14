package pendenciaOperadoresAtribuicao;

public class PendenciaOperadoresAtribuicao {

    public static int preIncremento(int numero) {
        return ++numero;
    }

    public static int preDecremento(int numero) {
        return --numero;
    }

    public static int posIncremento(int numero) {
        return numero++;
    }

    public static int posDecremento(int numero) {
        return numero--;
    }


    public static void main(String[] args){
        int numero = 5;
        System.out.println(preIncremento(numero));
        System.out.println(preDecremento(numero));
        System.out.println(posIncremento(numero));
        System.out.println(posDecremento(numero));
    }
}
