public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 4.9;
        double media = 7;
        
        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < media) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
