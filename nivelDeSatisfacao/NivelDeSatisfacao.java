package nivelDeSatisfacao;

public class NivelDeSatisfacao {
    public static void main(String[] args){
        int nivel = 3;
        String satisfacao = switch (nivel) {
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito satisfeito";
            default -> "Opção inválida (deve estar entre 1 e 5)";
        };
        System.out.println(satisfacao);
    }
}