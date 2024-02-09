package car_factory;

import java.util.Scanner;

public class Car_factory {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to car factory system:");
        System.out.println("press 1 :To build customized car");
        System.out.println("press 2: To reserve a new car");

        int i = input.nextInt();
        switch (i) {
            case 1:
                System.out.println(" press 1 : To build Ferrari");
                System.out.println(" press 2 : To build Subaru");
                int j = input.nextInt();
                if (j == 1) {
                    System.out.println("Enter car model:");
                    String model = input.next();
                    System.out.println("Enter car color:");
                    String color = input.next();
                    Ferrari car = new Ferrari(model, color);
                } else if (j == 2) {

                    System.out.println("Enter car model:");
                    String model = input.next();
                    System.out.println("Enter car color:");
                    String color = input.next();
                    subaru car = new subaru(model, color);

                } else {
                    System.out.println("Please enter a valid choice");

                }
                break;

            case 2:
                System.out.println("press 1 : To reserve a BMW car");
                System.out.println("press 2 : To reseve a Mercedes car");
                int z = input.nextInt();
                if (z == 1) {
                    BMW reserve_car = new BMW();
                    reserve_car.listofcars();

                } else if (z == 2) {
                    Mercedes reserve_car = new Mercedes();
                    reserve_car.listofcars();
                } else {
                    System.out.println("Please enter a valid choice");
                }
                break;

            default:
                System.out.println("Please enter a valid choice");
                break;
        }

    }

}
