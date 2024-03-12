
/**
 * Laptop
 */

import java.util.Objects;

public class Laptop {

    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    
    public Laptop(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    
    public int getRam() {
        return ram;
    }
    public int getHdd() {
        return hdd;
    }
    
    public String getColor() {
        return color;
    }
    public String getOs() {
        return os;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setOs(String os) {
        this.os = os;
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, hdd, os, color);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
    
        Laptop laptop = (Laptop) obj;
    
        return brand.equals(laptop.brand) &&
                    ram == laptop.ram &&
                    hdd == laptop.hdd &&
                    color.equals(laptop.color) &&
                    os.equals(laptop.os);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    
}


