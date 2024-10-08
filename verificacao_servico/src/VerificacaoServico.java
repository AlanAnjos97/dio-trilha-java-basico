import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        //System.out.println("Insira o serviço a ser pesquisado");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        //System.out.println("Insira o nome do cliente e os serviços contratados");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        List<String> servicosContratados = new ArrayList<>();

        for (int i = 1; i < partes.length; i++) {
            
            servicosContratados.add(partes[i]);
        }
        
        contratado = verificarServico(servico, servicosContratados);
        
        if (contratado) {
          System.out.println("Sim");
        } else {
          System.out.println("Nao");
        }
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        scanner.close();
        
        
        
        
    }
    
    static boolean verificarServico(String servico, List<String> servicosContratados) {
      
      for(String servicoContratado : servicosContratados){
        if (servico.equals(servicoContratado)) {
          return true;
        }
      }
    return false;
    }
}


// movel -> Alice,movel,fixa -> retorna true
// fixa -> Bob,movel,tv -> retorna false
// tv -> Carol,movel,fixa,tv -> retorna true