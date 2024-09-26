import java.util.Scanner;

public class Hamburgueria {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        System.out.println("Seja bem vindo a nossa Hamburgueria!! Selecione o seu pedido no menu de opções abaixo.");
        System.out.println("***************************");
        System.out.println("\n[1] X-Burguer (10,00 R$)");
        System.out.println("[2] X-Salada (16,00 R$)");
        System.out.println("[3] X-Picanha (25,00 R$)");
        System.out.println("[4] X-Tudo (27,00 R$)");
        System.out.println("[5] Hot Dog (7,00 R$)");
        System.out.println("\n***************************");

        double carrinho = 0;
        int option = 0;
        while (option != 6){
            option = valor.nextInt();

            switch (option) {
                case 1:
                    carrinho += 10;
                    System.out.println("Você adicionou um X-Burguer no seu carrinho!");
                    System.out.println("Valor a pagar: " + carrinho);

                    System.out.println("\nQuer adicionar mais algum item?");
                    System.out.println("***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
                    break;

                case 2:
                    carrinho += 16;
                    System.out.println("Você adicionou um X-Salada no seu carrinho!");
                    System.out.println("Valor a pagar: " + carrinho);

                    System.out.println("\nQuer adicionar mais algum item?");
                    System.out.println("***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
                    break;

                case 3:
                    carrinho += 25;
                    System.out.println("Você adicionou um X-Picanha no seu carrinho!");
                    System.out.println("Valor a pagar: " + carrinho);

                    System.out.println("\nQuer adicionar mais algum item?");
                    System.out.println("***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
                    break;

                case 4:
                    carrinho += 27;
                    System.out.println("Você adicionou um X-Tudo no seu carrinho!");
                    System.out.println("Valor a pagar: " + carrinho);

                    System.out.println("\nQuer adicionar mais algum item?");
                    System.out.println("***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
                    break;

                case 5:
                    carrinho += 7;
                    System.out.println("Você adicionou um Hot Dog no seu carrinho!");
                    System.out.println("Valor a pagar: " + carrinho);

                    System.out.println("\nQuer adicionar mais algum item?");
                    System.out.println("***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
                    break;

                case 6:
                    System.out.println("Obrigado pela preferência! Tenha uma ótima refeição!");
                    System.out.println("Valor a pagar: " + carrinho);
                    break;
                default:
                    System.out.println("Opção invalida, por favor, selecione uma opção válida!");
                    System.out.println("\n***************************");
                    System.out.println("\n[1] X-Burguer (10,00 R$)");
                    System.out.println("[2] X-Salada (16,00 R$)");
                    System.out.println("[3] X-Picanha (25,00 R$)");
                    System.out.println("[4] X-Tudo (27,00 R$)");
                    System.out.println("[5] Hot Dog (7,00 R$)");
                    System.out.println("[6] Encerrar pedido");
                    System.out.println("\n***************************");
            }
        }
    }
}