package ua.lviv.iot.Lab3.model;

public class Flower extends Product {
    private String typeOfFlower;
    private int howMuchDaysCanLive;

    Flower() {
        this(null, null, 0, 0, null, 0);
    }

    public Flower(final String typeOfProduct, final String color,
                  final int heightInSm, final double priceInUAH,
                  final String flowerType, final int howMuchDaysLive) {
        super(typeOfProduct, color, heightInSm, priceInUAH);
        this.typeOfFlower = flowerType;
        this.howMuchDaysCanLive = howMuchDaysLive;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " typeOfFlower" + "," + " howMuchDaysCanLive ";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " typeOfFlower = " + getTypeOfFlower() + ","
                + " howMuchDaysCanLive = " + getHowMuchDaysCanLive();
    }

    public final String getTypeOfFlower() {
        return typeOfFlower;
    }

    public final void setTypeOfFlower(final String typeOfFlower) {
        this.typeOfFlower = typeOfFlower;
    }

    public final int getHowMuchDaysCanLive() {
        return howMuchDaysCanLive;
    }

    public final void setHowMuchDaysCanLive(final int howMuchDaysLive) {
        this.howMuchDaysCanLive = howMuchDaysLive;
    }
}
