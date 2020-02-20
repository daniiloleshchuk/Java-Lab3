package ua.lviv.iot.Lab3.model;

public abstract class Product {
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
        return "typeOfProduct" + ","
                + " color " + ","
                + " heightInSm" + ","
                + " priceInUAH";
    }

    public String toCSV() {
        return "typeOfProduct = " + getTypeOfProduct() + ","
                + " color = " + getColor() + ","
                + " heightInSm = " + getHeightInSm() + ","
                + " priceInUAH = " + getPriceInUAH();
    }


    public final String getTypeOfProduct() {
        return typeOfProduct;
    }

    public final void setTypeOfProduct(final String productType) {
        this.typeOfProduct = productType;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(final String colorOfProduct) {
        this.color = colorOfProduct;
    }

    public final int getHeightInSm() {
        return heightInSm;
    }

    public final void setHeightInSm(final int heightOfProductInSm) {
        this.heightInSm = heightOfProductInSm;
    }

    public final double getPriceInUAH() {
        return priceInUAH;
    }

    public final void setPriceInUAH(final double priceOfProductInUAH) {
        this.priceInUAH = priceOfProductInUAH;
    }
}
