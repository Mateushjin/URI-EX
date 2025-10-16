import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hourWork = scanner.nextInt();
        double hourSalary = scanner.nextDouble();
        double salary = hourWork * hourSalary;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);


        scanner.close();
    }
}
