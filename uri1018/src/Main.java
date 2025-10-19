import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        int nota100 = valor / 100;
        int resto = valor % 100;
        int nota50 = (resto / 50);
        resto = resto % 50;
        int nota20 = resto / 20;
        resto = resto % 20;
        int nota10 = resto / 10;
        resto = resto % 10;
        int nota5 = resto / 5;
        resto = resto % 5;
        int nota2 = resto / 2;
        resto = resto % 2;
        int nota1 = resto;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);


        scanner.close();
    }
}
