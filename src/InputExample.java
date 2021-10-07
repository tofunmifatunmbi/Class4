import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter name");
        //String name = scanner.nextLine(); This will only print the first name without the last name
        String name = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);
*/  System.out.println("Enter x value: ");
    int x = scanner.nextInt();

    System.out.println("Enter y value: ");
    int y = scanner.nextInt();

    if (x < y)
    {
        System.out.println("Y is greater than x");
    } else
    {
        System.out.println("x is greater than y");
    }
    }
}
