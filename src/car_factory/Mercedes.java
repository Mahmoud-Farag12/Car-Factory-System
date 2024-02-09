package car_factory;

import java.util.Scanner;

public class Mercedes extends newcar {

    Scanner input = new Scanner(System.in);

    void listofcars() {

        System.out.println("select one of the cars:");
        System.out.println("1-Mercedes C180 : Price= 30000$ - Avilable colors=(blue,white,black)");
        System.out.println("2-Mercedes C200 : Price= 40000$ - Avilable colors=(orange,silver,blue)");
        System.out.println("3-Mercedes E180 : Price= 25000$ - Avilable colors=(red,black,silver,white)");
        System.out.println("4-Mercedes E200 : Price= 30000$ - Avilable colors=(red,black,blue)");

        super.choice = input.nextInt();

        System.out.println("Enter car color:");
        super.color = input.next();

        switch (this.choice) {
            case 1:
                System.out.println("You reserved Mercedes C180 : Price= 30000$ - color = " + this.color + "  successfully");
                break;
            case 2:
                System.out.println("You reserved Mercedes C200 : Price= 40000$ - color = " + this.color + "  successfully");
                break;
            case 3:
                System.out.println("You reserved Mercedes E180 : Price= 25000$ - color = " + this.color + "  successfully");
                break;
            case 4:
                System.out.println("You reserved Mercedes E200 : Price= 30000$ - color = " + this.color + "  successfully");
                break;
            default:
                System.out.println("Enter a valid choice");
        }
        System.out.println("we appreciate your time");
    }

}
