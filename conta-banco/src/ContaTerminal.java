import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite a conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Digite o saldo:");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá, " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", sua conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
