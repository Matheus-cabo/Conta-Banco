
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;
        String resp = "s";

        while (resp.equals("s")) {
            //Entrada, número conta.
            System.out.println("Programa-> Por favor, digite o número da conta: ");
            conta = sc.nextInt();
            sc.nextLine();

            //Entrada, número agência
            System.out.println("Programa-> Por favor, digite o número da agência: ");
            agencia = sc.next();
            sc.nextLine(); 

            //Entrada, nome do cliente
            System.out.println("Programa-> Por favor, digite o seu nome: ");
            nomeCliente = sc.next();
            sc.nextLine();

            //Entrada, numero do saldo
            System.out.println("Programa-> Por favor, digite o seu saldo: ");
            saldo = sc.nextDouble();
            sc.nextLine();

            System.out.println("Olá " + nomeCliente + "!");
            System.out.println("Obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agencia é: " + agencia);
            System.out.println("Sua conta e: " + conta);
            System.out.println("E seu saldo " + saldo + "R$ já está dsponível para saque");
            System.out.println("Deseja adicionar outra conta?(s/n) ");
            resp = sc.next();
        }
        sc.close();         
    }
}
