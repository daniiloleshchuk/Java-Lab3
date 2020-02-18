package ua.lviv.iot.Lab3.model;

public class Vase extends Product {
    private int volumeInMl;

    public Vase() {
        this(null, null, 0, 0, 0);
    }

    public Vase(
            final String typeOfProduct,
            final String color, final int heightInSm,
            final double priceInUAH, final int volumeOfVaseInMl) {
        super(typeOfProduct, color, heightInSm, priceInUAH);
        this.volumeInMl = volumeOfVaseInMl;
    }

    public final int getVolumeInMl() {
        return volumeInMl;
    }

    public final void setVolumeInMl(final int volumeOfVaseInMl) {
        this.volumeInMl = volumeOfVaseInMl;
    }
}
