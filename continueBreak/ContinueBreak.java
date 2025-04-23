package continueBreak;

public class ContinueBreak {
    public static void main(String[] args){
        var codigoDeSaida = 35;
        for (int codigoCarteirinha = 1; codigoCarteirinha < 10; codigoCarteirinha++){
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("É seu código"); 
                break;
            } else if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {continue;}
            System.out.println("Código da carteirinha: " + codigoCarteirinha + " não é aceito.");
        }
    }
}
