package Classes;

//public --unrestricted access to method
public class Car {

    // creating private fields --restricted access
    // private int doors;
    // private int wheels;
    private String model;
    // private String engine;
    // private String color;
    //

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("altima")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
