import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a + b + abs(a - b)) / 2;
        maiorAB = (maiorAB + c + abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maiorAB);

        scanner.close();
    }
}
