import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o valor do produto (R$): ");
        double produto = valor.nextDouble();

        produto -= (produto * 10/100);
        System.out.println("Produto com 10% de desconto: " + produto + " R$");
    }
}