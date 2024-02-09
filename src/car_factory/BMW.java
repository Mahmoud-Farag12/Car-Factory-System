package car_factory;

import java.util.Scanner;

public class BMW extends newcar {

    Scanner input = new Scanner(System.in);

    void listofcars() {

        System.out.println("select one of the cars:");
        System.out.println("1-BMW M3 : Price= 20000$ - Avilable colors=(red,green,blue)");
        System.out.println("2-BMW M4 : Price= 25000$ - Avilable colors=(red,black,silver)");
        System.out.println("3-BMW M5 : Price= 30000$ - Avilable colors=(orange,silver,blue)");
        System.out.println("4-BMW M6 : Price= 40000$ - Avilable colors=(blue,white,black)");

        super.choice = input.nextInt();
        System.out.println("Enter car color:");
        super.color = input.next();

        switch (this.choice) {
            case 1:
                System.out.println("You reserved BMW M3 : Price= 20000$ - color = " + this.color + "  successfully");
                break;
            case 2:
                System.out.println("You reserved BMW M4 : Price= 25000$ - color = " + this.color + "  successfully");
                break;
            case 3:
                System.out.println("You reserved BMW M5 : Price= 30000$ - color = " + this.color + "  successfully");
                break;
            case 4:
                System.out.println("You reserved BMW M6 : Price= 40000$ - color = " + this.color + "  successfully");
                break;
            default:
                System.out.println("Enter a valid choice");
        }
        System.out.println("we appreciate your time");

    }
}
