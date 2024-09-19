package Labs;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avg = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %s, Grade: %s", name, age, avg);
    }
}
