import java.util.Scanner;

public class verificarComboCompleto {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificaComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Verifique quais serviços foram contratados
            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        // Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        // Solicitando ao usuário a lista de serviços contratados
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário a lista de serviços contratados
            String input = scanner.nextLine();
            // Convertendo a entrada em uma lista de strings
            String[] servicosContratados = input.split(",");
            // Verificando se o cliente contratou um combo completo
            String resultado = verificaComboCompleto(servicosContratados);
            // Exibindo o resultado
            System.out.println(resultado);
            // Fechando o scanner
        }
    }
}