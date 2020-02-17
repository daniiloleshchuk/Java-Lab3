package ua.lviv.iot.Lab3.model;

public class Flower extends Product {
    private String typeOfFlower;
    private int howMuchDaysCanLive;

    Flower() {
        this(null, null, 0, 0, null,0);
    }

    public Flower(String typeOfProduct, String color, int heightInSm, double priceInUAH, String typeOfFlower, int howMuchDaysCanLive) {
        super(typeOfProduct, color, heightInSm, priceInUAH);
        this.typeOfFlower = typeOfFlower;
        this.howMuchDaysCanLive = howMuchDaysCanLive;
    }

    public String getTypeOfFlower() {
        return typeOfFlower;
    }

    public void setTypeOfFlower(String typeOfFlower) {
        this.typeOfFlower = typeOfFlower;
    }

    public int getHowMuchDaysCanLive() {
        return howMuchDaysCanLive;
    }

    public void setHowMuchDaysCanLive(int howMuchDaysCanLive) {
        this.howMuchDaysCanLive = howMuchDaysCanLive;
    }
}