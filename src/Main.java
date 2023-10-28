import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        double accountBalance = 3000.00;

        System.out.printf("""
                ********************************
                Dados iniciais do cliente:
                
                Nome:             Vitor Natario
                Tipo conta:       Corrente
                Saldo inicial:    R$ %.2f
                ********************************
                """, accountBalance);

        while (menu != 4){
            System.out.print("""
                
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:\s""");

            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.printf("Saldo na conta R$ %.2f%n", accountBalance);
                    break;

                case 2:
                    System.out.print("Digite o valor a receber ==> R$ ");
                    double amountReceive = scanner.nextDouble();

                    if(amountReceive <= 0){
                        System.out.println("Valor inválido, insira um valor positivo");
                    } else {
                        accountBalance += amountReceive;
                        System.out.printf("Saldo atualizado R$ %.2f", accountBalance);
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor a transferir ==> R$ ");
                    double valueToTransfer = scanner.nextDouble();

                    if(valueToTransfer <= 0 || valueToTransfer > accountBalance){
                        System.out.println("Valor inválido para transferência");
                    } else {
                        accountBalance -= valueToTransfer;
                        System.out.printf("Novo saldo R$ %.2f", accountBalance);
                    }
                    break;

                case 4:
                    System.out.println("Fechando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida");


            }
        }
    }
}