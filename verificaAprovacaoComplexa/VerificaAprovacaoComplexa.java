package verificaAprovacaoComplexa;

public class VerificaAprovacaoComplexa {

    public static boolean verificaAprovacaoMedia(int nota1, int nota2){
        float media = (nota1 + nota2) / 2.0f;
        return media >= 7.0f;
    }
    public static void main(String[] args)  {
        int nota1 = 0;
        int nota2 = 8;
        float frequencia = 0.75f;
        if (verificaAprovacaoMedia(nota1, nota2)) {
            if (frequencia >= 0.75f) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado por falta!");
            }
        } else {
            System.out.println("Reprovado por nota!");
        }
    }
}
