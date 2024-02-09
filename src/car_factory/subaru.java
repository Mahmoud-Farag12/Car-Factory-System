package car_factory;

public class subaru implements car {

    subaru(String model, String color) {

        setcar_specfications(model, color);
    }

    public void setcar_specfications(String car_model, String car_color) {

        System.out.println("The Subaru car : model :" + car_model + " and color:" + car_color);
        System.out.println("will be ready in a month");
        System.out.println("we appreciate your time");
    }

}
