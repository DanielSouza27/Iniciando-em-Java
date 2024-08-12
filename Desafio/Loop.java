import java.util.Scanner;

public class Loop
{
    public static void main (String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        double mediaDeAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1)
        {
            System.out.println("Digite sua avaliação para o filme  ou -1 para encerrar.");
            nota = leitura.nextDouble();

            if (nota !=-1)
            {
                mediaDeAvaliacao += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações" + mediaDeAvaliacao/totalDeNotas);

        System.out.println("");
    }
}
