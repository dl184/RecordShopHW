package Instruments;

public abstract class Instrument {

    private String manufacturer;
    private String type;
    private String colour;

    public Instrument(String manufacturer, String type, String colour){
        this.manufacturer = manufacturer;
        this.type = type;
        this.colour = colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
