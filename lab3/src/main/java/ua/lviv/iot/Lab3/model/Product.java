package ua.lviv.iot.Lab3.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String typeOfProduct;

    private String color;

    private int heightInSm;

    private double priceInUAH;

    public Product() {
        this(null, null, 0, 0);
    }

    public Product(
            final String productType, final String colorOfProduct,
            final int heightOfProductInSm, final double priceOfProductInUAH) {
        this.typeOfProduct = productType;
        this.color = colorOfProduct;
        this.heightInSm = heightOfProductInSm;
        this.priceInUAH = priceOfProductInUAH;
    }

    public String getHeaders() {
        return "typeOfProduct" + "," + " color " + "," + " heightInSm" + "," + " priceInUAH";
    }

    public String toCSV() {
        return "typeOfProduct = " + getTypeOfProduct() + ","
                + " color = " + getColor() + ","
                + " heightInSm = " + getHeightInSm() + ","
                + " priceInUAH = " + getPriceInUAH();
    }


    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(final String productType) {
        this.typeOfProduct = productType;
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
