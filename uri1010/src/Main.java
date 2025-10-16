import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod1, peca1, cod2, peca2;
        double preco1, preco2;

        cod1 = scanner.nextInt();
        peca1 = scanner.nextInt();
        preco1 = scanner.nextDouble();

        cod2 = scanner.nextInt();
        peca2 = scanner.nextInt();
        preco2 = scanner.nextDouble();

        double valorPagar = (peca1 * preco1 + peca2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorPagar);

        scanner.close();
    }
}
