import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a  classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuario
        //Obter pela classe scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, Informe seu nome !");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem de conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}