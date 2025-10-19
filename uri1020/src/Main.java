import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();

        int anos = dias / 365;
        int resto = dias % 365;
        int meses = resto / 30;
        int dia = resto % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dia + " dia(s)");


        scanner.close();
    }
}
