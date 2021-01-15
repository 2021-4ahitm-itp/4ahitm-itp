package at.htl.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;

    private String brand;
    private String model;
    private double pricePerDay;

    public Vehicle(String brand, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
