package ua.lviv.iot.Lab3.model;

public class Flower extends Product {
    private String typeOfFlower;

    Flower() {
        this(null, null, 0, 0, null);
    }

    public Flower(String typeOfProduct, String color, int heightInSm, double priceInUAH, String typeOfFlower) {
        super(typeOfProduct, color, heightInSm, priceInUAH);
        this.typeOfFlower = typeOfFlower;
    }

    public String getTypeOfFlower() {
        return typeOfFlower;
    }

    public void setTypeOfFlower(String typeOfFlower) {
        this.typeOfFlower = typeOfFlower;
    }
}