public class SistemaMedida {
    public static void main(String[] args) {
        String tamanho = "GG";

        switch (tamanho) {
            case "P": {
                System.out.println("Tamanho Pequeno");
                break;
            }
            case "M": {
                System.out.println("Tamanho Médio");
                break;
            }
            case "G": {
                System.out.println("Tamanho Grande");
                break;
            }
            default: {
                System.out.println("Tamanho Não Encontrado");
            }
        }
        
    }
}
