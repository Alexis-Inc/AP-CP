
/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    //Things a car has:
    private String engine;
    private boolean isAutomatic;
    private int octaneNeeded;
    private double currentFuelLevel;
    private String brand;

    //constructor
    public Car(String engineType, boolean isAutomatic,
    int octaneRating,double currentFuelLevel, String brand){
        engine = engineType;
        this.isAutomatic = isAutomatic;
        octaneNeeded = octaneRating;
        this.currentFuelLevel = currentFuelLevel;
        this.brand = brand;
    }

    public Car(){
        engine = "V6";
        isAutomatic = true;
        octaneNeeded = 91;
        currentFuelLevel = 15.8;
        brand = "Toyota";

    }

    public Car(String engine){
        this(engine, true, 91, 15.8, "Toyota");
    }
    //Accessor Methods
    public String getEngine(){
        return engine;   
    }

    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    public String getBrand(){
        return brand;
    }

    public boolean isAutomatic(){
        return isAutomatic;
    }  

    public void printIsAutomatic(){
        System.out.println("Automatic? " + this.isAutomatic);
        System.out.println("Automatic? " + this.isAutomatic());
    }

    //Mutator Methods
    public void setEngine(String newEngine){
        engine = newEngine;
    }

    public void toggleAutomatic(){
        if (isAutomatic){
            isAutomatic = false;
        } else {
            isAutomatic = true;
        }
    }

    public void setfuel(int gasToAdd){
        currentFuelLevel += gasToAdd;
    }

    public void drive(){
        currentFuelLevel--;
        System.out.println("You drive and use 1 gal of fuel");
    }

    public void upgradeCar(){
        this.setEngine("V8");
        toggleAutomatic();
        setfuel(10);
        drive();
    }
}