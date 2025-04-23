package verificacaoAprovacaoSimplificada;


public class VerificacaoAprovacaoSimplificada {

    public static boolean verificarAprovacao(int nota1, int nota2) {
        if ((nota1+nota2)/2 >= 6) {
            return true;
        }; 
        return false;
    }

    public static void main(String[] args) {
        int nota1 = 4;
        int nota2 = 8;
        if (verificarAprovacao(nota1, nota2)) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
