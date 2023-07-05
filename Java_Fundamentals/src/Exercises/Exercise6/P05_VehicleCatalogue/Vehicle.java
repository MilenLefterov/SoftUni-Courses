package Exercises.Exercise6.P05_VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private String horsepower;


    public Vehicle(String type, String model, String color, String horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        String typeVeh = this.type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh +
                "\nModel: " + this.model +
                "\nColor: " + this.color +
                "\nHorsepower: " + this.horsepower;

    }
}
