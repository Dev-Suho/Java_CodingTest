package test;

class abVehicle {
    String name;

    public abVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return "Vehicle name : " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Car extends abVehicle {

    String name;

    public Car(String val) {
        super(val);
        this.name = val;
    }

    @Override
    public String getName() {
        return "Car name : " + name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName(byte val[]) {
        return "Car name : " + val;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        abVehicle obj = new Car("Spark");
        System.out.println(obj.getName());
    }
}