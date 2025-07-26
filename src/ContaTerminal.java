import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ContaTerminal {
    public static void main(String[] args){
        var s = new Scanner(System.in);
        System.out.println("Digite o número da conta número:");
        int numero = s.nextInt();
        System.out.println("Digite sua agencia:");
        String agencia = s.next();
        System.out.println("Digite seu nome:");
        String NomeCliente = s.next();
        System.out.println("Informe seu saldo:");
        double saldo = s.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                        "conta %s e seu saldo %.2f já está disponível para saque%n",
                NomeCliente, agencia, numero, saldo);
    }

}

