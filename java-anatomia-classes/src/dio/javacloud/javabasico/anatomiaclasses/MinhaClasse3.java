package dio.javacloud.javabasico.anatomiaclasses;
public class MinhaClasse3 {
    public static void main (String [] args) {
        // String meuNome = "Fulano";

        // int anoFabricacao = 2025;

        // boolean verdadeira = true;

        // anoFabricacao = 2018;
        String primeiroNome = "Fulano";
        String segundoNome = "de Tal";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
