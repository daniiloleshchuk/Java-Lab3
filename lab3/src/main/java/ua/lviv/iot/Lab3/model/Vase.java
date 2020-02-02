package ua.lviv.iot.Lab3.model;

public class Vase extends Product {
    private int volumeInMl;

    public Vase() {
        this(null, null, 0, 0, 0);
    }

    public Vase(String typeOfProduct, String color, int heightInSm, double priceInUAH, int volumeInMl) {
        super(typeOfProduct, color, heightInSm, priceInUAH);
        this.volumeInMl = volumeInMl;
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }

    public void setVolumeInMl(int volumeInMl) {
        this.volumeInMl = volumeInMl;
    }
}
