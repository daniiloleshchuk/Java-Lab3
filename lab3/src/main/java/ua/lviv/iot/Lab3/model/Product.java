package ua.lviv.iot.Lab3.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String color;

    private int heightInSm;

    private double priceInUAH;

    public Product() {
    }

    public Product(
            final String colorOfProduct,
            final int heightOfProductInSm, final double priceOfProductInUAH) {
        this.color = colorOfProduct;
        this.heightInSm = heightOfProductInSm;
        this.priceInUAH = priceOfProductInUAH;
    }

    public String getHeaders() {
        return "typeOfProduct" + "," + " color " + "," + " heightInSm" + "," + " priceInUAH";
    }

    public String toCSV() {
        return "typeOfProduct = "
                + " color = " + getColor() + ","
                + " heightInSm = " + getHeightInSm() + ","
                + " priceInUAH = " + getPriceInUAH();
    }


    public String getColor() {
        return color;
    }

    public void setColor(final String colorOfProduct) {
        this.color = colorOfProduct;
    }

    public int getHeightInSm() {
        return heightInSm;
    }

    public void setHeightInSm(final int heightOfProductInSm) {
        this.heightInSm = heightOfProductInSm;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(final double priceOfProductInUAH) {
        this.priceInUAH = priceOfProductInUAH;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }
}
