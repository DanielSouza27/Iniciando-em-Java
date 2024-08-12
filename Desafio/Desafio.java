import java.util.Scanner;

public class Desafio
{
    public static void main(String[] args)
    {
            String nome = "Daniel Silva";
            String tipoConta = "Corrente";
            double saldo = 1599.90;
            int opcao = 0;

            System.out.println("*********************");
            System.out.println("\nNome do Cliente: "+ nome);
            System.out.println("Tipo de Conta: "+ tipoConta);
            System.out.println("Saldo atual: "+ saldo);
            System.out.println("\n*********************");

            String menu = """
                    ** Digite sua opção **
                    1 - Consultar saldo
                    2 - Tranferir valor
                    3 - Receber valor
                    4 - Sair
                    
                    """;
            Scanner leitura = new Scanner(System.in);
            while (opcao != 4) {
                System.out.println(menu);
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println("O saldo atualizado é "+ saldo);
                } else if (opcao == 2) {
                    System.out.println("Qual o valor que deseja transgerir?" );
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não a saldo para realizar a transferência");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo" +saldo);
                    }
                }else if (opcao == 3) {
                    System.out.println("Valor recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                } else if (opcao !=4) {
                    System.out.println("Opção invalida!");
                }
            }
    }
}
