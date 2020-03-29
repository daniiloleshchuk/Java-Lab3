package ua.lviv.iot.Lab3.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;

@Entity
@DynamicUpdate
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

    public String getTypeOfFlower() {
        return typeOfFlower;
    }

    public void setTypeOfFlower(final String typeOfFlower) {
        this.typeOfFlower = typeOfFlower;
    }

    public int getHowMuchDaysCanLive() {
        return howMuchDaysCanLive;
    }

    public void setHowMuchDaysCanLive(final int howMuchDaysLive) {
        this.howMuchDaysCanLive = howMuchDaysLive;
    }
}
