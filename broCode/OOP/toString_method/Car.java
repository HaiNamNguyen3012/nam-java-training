package broCode.OOP.toString_method;
// This file is part of the OOP Object
public class Car {
    //toString method
    //toString() = special method that all objects inherit
    //that returns a string that "textually represents" an object
    // can be used both implicitly and explicitly
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2022;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
