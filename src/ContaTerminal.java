
import java.util.Scanner;

public class ContaTerminal {
  /**
   * Desafio de sintaxe para praticar variáveis, entrada de dados e estrutura
   * básica de um programa em Java.
   * 
   * Coletar informações do usuário e exibir mensagem final.
   * int, Numero da conta.
   * String, Agencia.
   * String, Nome do Cliente.
   * double, Saldo.
   */
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o número da Conta: ");
    while (!scan.hasNextInt()) {
      System.out.println("Por favor, insira um número válido!");
      System.out.print("Digite o número da Conta: ");
      scan.next();
    }

    int numero = scan.nextInt();
    scan.nextLine();

    System.out.print("Digite o número da Agência com o digito: ");
    String agencia = scan.nextLine();

    System.out.print("Digite o seu nome: ");
    String nome = scan.nextLine();

    System.out.print("Digite o Saldo da conta: ");
    while (!scan.hasNextDouble()) {
      System.out.println("Por favor, insira um Saldo válido!");
      System.out.print("Digite o Saldo da conta: ");
      scan.next();
    }
    double saldo = scan.nextDouble();

  }
}
