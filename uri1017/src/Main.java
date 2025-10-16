import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        double velocidadeMedia = scanner.nextDouble();
        double litros = time * velocidadeMedia / 12;

        System.out.printf("%.3f\n", litros);

        scanner.close();
    }
}
