import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Agora, o número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Seu nome por favor:");
        String nomeCliente = scanner.next();
        System.out.println("Saldo bancário:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close();
    }
}
