import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeDoVendedor = scanner.next();
        double salario = scanner.nextDouble();
        double vendaTotalEfetuadoMes = scanner.nextDouble();

        double totalReceber = salario + vendaTotalEfetuadoMes * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", totalReceber);

        scanner.close();
    }
}
