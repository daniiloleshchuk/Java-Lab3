package ua.lviv.iot.Lab3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Flower extends Product {

    private int howMuchDaysCanLive;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="flower_type_id")
    @JsonIgnoreProperties("flowers")
    private FlowerType flowerType;


    @ManyToMany(mappedBy = "flowers")
    /*
    @JoinTable(name = "Flowers_Localities",
            joinColumns = { @JoinColumn(name = "flower_id", nullable=false)},
            inverseJoinColumns = { @JoinColumn(name = "flower_locality_id", nullable=false)})
     */
    @JsonIgnoreProperties("flowers")
    private Set<FlowerLocality> localities;

    public Flower(final String color, final int heightInSm, final double priceInUAH, final int howMuchDaysLive) {
        super(color, heightInSm, priceInUAH);
        this.howMuchDaysCanLive = howMuchDaysLive;
    }

    public Flower() {
        super();
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " typeOfFlower" + "," + " howMuchDaysCanLive ";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " typeOfFlower = " + " howMuchDaysCanLive = " + getHowMuchDaysCanLive();
    }

    public int getHowMuchDaysCanLive() {
        return howMuchDaysCanLive;
    }

    public void setHowMuchDaysCanLive(final int howMuchDaysLive) {
        this.howMuchDaysCanLive = howMuchDaysLive;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Set<FlowerLocality> getLocalities() {
        return localities;
    }

    public void setLocalities(Set<FlowerLocality> localities) {
        this.localities = localities;
    }


}
