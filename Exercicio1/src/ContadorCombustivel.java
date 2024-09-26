import java.util.Scanner;

public class ContadorCombustivel {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Insira o valor da distancia percorrida no trajeto em quilometros (Km): ");
        double distancia = valor.nextDouble();

        System.out.println("Insira o valor do combustivel gasto no trajeto em litros (L): ");
        double combustivel = valor.nextDouble();

        double gastoCombustivel = distancia / combustivel;
        System.out.println("O gasto de combustivel deste automóvel é de: " + gastoCombustivel + " (Km/l)");
    }
}