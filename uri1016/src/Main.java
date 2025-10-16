import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        int timeKm = km * 2;

        System.out.println(timeKm + " minutos");

        scanner.close();
    }
}
