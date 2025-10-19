import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minuto = resto / 60;
        int segundo = resto % 60;


        System.out.println(horas + ":" + minuto + ":" + segundo);

        scanner.close();
    }
}
