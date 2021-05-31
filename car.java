package Carsales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moham
 */
public class car {
    private String model;
    private String manufacturer;
    private int year;
    private double price;
    private double distanceTravelled;

    public car() {
       carList.numOfCars++;
    }

    public car(String model, String manufacturer, int year, double price, double distanceTravelled) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.distanceTravelled = distanceTravelled;
        carList.numOfCars++;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.manufacturer = Manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    
}
