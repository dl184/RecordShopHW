package Accessories;

import Accessories.DrumSticks;
import Accessories.GuitarStrings;

public abstract class Accessory {

    private String manufacturer;
    private String type;
    private double buyPrice;
    private double sellPrice;


    public Accessory(String manufacturer, String type, double buyPrice, double sellPrice){
        this.manufacturer = manufacturer;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
