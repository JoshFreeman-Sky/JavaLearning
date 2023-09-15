import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String firstname = "Josh";
        String lastname = "Freeman";
        String name = firstname + lastname;
        System.out.println(name);


        int num1 = 10;
        int num2 = 2;
        int num3 = 8;
        int result = num1 / num2;

        System.out.println(num1 + num2);
        System.out.println(result);
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);


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
        System.out.println("Welcome " + nameFirstname + " " + nameSurname);
        System.out.println("Your number choice calculation is = " + sum + sum2);


        //exercise

        int x = 3 , y = 5;
        if (x >= 0)
            if (y < x)
                System.out.println("y is less than x");
        else
                System.out.println("X is negative");

        int x = 7;
        if (x == 0)
            System.out.println("x is zero");



        int x = 15, y = 24;
        if ( x % 2 == 0 && y % 2 == 0 )
            System.out.println("x and y are even numbers");
        */


        /*
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }


        int i = 0;
        int j = 10;
        while (i < j){
            System.out.println("i =" + i);
            System.out.println("j = " +j);
            i++;
            j--;

        }

        do {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            i++;
            j--;
        } while (i < j);
        */

        /*
        int sum 0;
        for (int i = 0; i < 10; sum += i, i++)
        {}
        */
        /*
        int x = 10;
        while (x > 0) {
            System.out.print(x--);
        }
        System.out.println("We have lift off!");
        */



        int x = 10;
        while (x > 0) {
            System.out.println("x is " + x);
            x--;
        }



        /*
        int i = 0;
        while (i <10) {
            System.out.println("i - " + i);
            i++;
        }


        int i = 0;
        do {
            System.out.println("i -" + i);
            i++;
        } while (i < 10);
        */

        int sum = 0;
        int i = 0;
        for (; i < 10; sum += i++) {
            ;
        }
        System.out.println("Sum is " + sum);


    }
}