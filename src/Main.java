import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String firstname ="Josh";
        String lastname ="Freeman";
        String name = firstname + lastname;
        System.out.println(name);
         */
        /*
        int num1 = 10;
        int num2 = 2;
        int num3 = 8;
        int result = num1 / num2;

        System.out.println(num1 + num2);
        System.out.println(result);
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
        */

        // "num3" shows 8 , num3++ shows 8 , ++num3 shows 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your First name");
        String nameFirstname = scanner.nextLine();
        System.out.println("Please enter your Last name");
        String nameSurname = scanner.nextLine();
        System.out.println("Please enter a number");
        int sum = scanner.nextInt();
        System.out.println("Please enter another number");
        int sum2 = scanner.nextInt();
        System.out.println("Welcome " + nameFirstname + " "  + nameSurname);
        System.out.println("Your number choice calculation is = " + sum + sum2);


    }
}