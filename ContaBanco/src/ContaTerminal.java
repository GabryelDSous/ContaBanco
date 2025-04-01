import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Obtendo os dados do cliente
        System.out.print("Informe seu número: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String numAgencia = scanner.nextLine();

        System.out.print("Informe seu nome completo: ");
        String numeCompleto = scanner.nextLine();

        System.out.print("Informe seu saldo bancária: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", numeCompleto, numAgencia, numero, saldo);
    }
}
