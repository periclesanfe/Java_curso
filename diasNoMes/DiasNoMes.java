package diasNoMes;

public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Fevereiro";
        String diasNoMEs = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31 dias";
            case "Abril", "Junho", "Setembro", "Novembro" -> "30 dias";
            case "Fevereiro" -> "28 dias (ou 29 em anos bissextos)";
            default -> "Mês inválido (deve estar entre Janeiro e Dezembro)";
        };
        System.out.println(diasNoMEs);
    }
}
