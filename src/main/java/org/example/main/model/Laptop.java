/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.main.model;

/**
 *
 * @author Kawmal Kashmika
 */
public class Laptop {
    private String brand;
    private String model;
    private String falult;
    private boolean battery;
    private boolean dvd;
    private boolean hardDisk;
    private boolean charger;
    private boolean ram;

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

    public String getFalult() {
        return falult;
    }

    public void setFalult(String falult) {
        this.falult = falult;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public boolean isHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(boolean hardDisk) {
        this.hardDisk = hardDisk;
    }

    public boolean isCharger() {
        return charger;
    }

    public void setCharger(boolean charger) {
        this.charger = charger;
    }

    public boolean isRam() {
        return ram;
    }

    public void setRam(boolean ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", model=" + model + ", falult=" + falult + ", battery=" + battery + ", dvd=" + dvd + ", hardDisk=" + hardDisk + ", charger=" + charger + ", ram=" + ram + '}';
    }
    
    
}


