import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Integer numberAccount;
        String agency;
        String clientName;
        Double balance;
        
        System.out.print("Por favor, digite o número da Agência! ");
        numberAccount = Integer.parseInt(sc.nextLine());
        System.out.println();

        System.out.print("Por favor, digite o número da Conta! ");
        agency = sc.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o nome completo! ");
        clientName = sc.nextLine();
        System.out.println();

        System.out.print("Por favor, digite seu deposito inicial! ");
        balance = sc.nextDouble();
        System.out.println();

        System.out.printf("Olá %s!,\nobrigado por criar uma conta em nosso banco!\nsua agência é %s.\nconta %d. \ne seu saldo %.2f já está disponível para saque.",
        clientName, 
        agency, 
        numberAccount, 
        balance);
        
        sc.close();     
    }
}
