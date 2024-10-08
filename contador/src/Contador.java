import java.util.Scanner;


public class Contador {    
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
            terminal.close();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        
    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            
            System.out.println("Do número " + parametroUm + " até o número " + parametroDois + " temos:");
            
            for(int index = parametroUm; index <= parametroDois; index ++) {
                System.out.println(index);
            }
            
            System.out.println("A diferença de números entre os inputs é de: " + contagem + " números");
        } else {
            throw new ParametrosInvalidosException();
        }
    }

    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException() {
            super("O primeiro parâmetro deve ser menor que o valor do segundo parâmetro");
        }
    }
}
