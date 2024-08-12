public class Condicional
{
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2022)
        {
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else
        {
            System.out.println("Filme retrô que vale a pena existir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus"))
        {
            System.out.println("Filme liberado");
        } else
        {
            System.out.println("Deve liberar o plano plus");
        }
    }
}
