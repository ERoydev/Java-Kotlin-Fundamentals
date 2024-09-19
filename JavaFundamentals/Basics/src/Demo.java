import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to take inputs

        // Rules for Variables
        // 1. Data Type, 2. Name of variable(Camel Case), 3. Maximal concrete

        // Samo stringa e s glavna bukva shtoto e referenten tip danni
        String name = scanner.nextLine();

        // Tezi dolo sa primitivni tipove danni
        int number = Integer.parseInt(scanner.nextLine());

        double salary = Double.parseDouble(scanner.nextLine());

        char symbol = scanner.nextLine().charAt(0);

        boolean isTrue = true;

        // Here i parse String "5" for example into integer
        // int number = Integer.parseInt(scanner.nextLine());


        System.out.println(name);

        System.out.println("hello world!"); // Print on a new line
        System.out.print("hello world!"); // Just print
        System.out.printf("Hello %s", name); // Format print
    }
}
