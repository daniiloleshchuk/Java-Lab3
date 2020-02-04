package ua.lviv.iot.Lab3.model;

public abstract class Product {
    private String typeOfProduct;
    private String color;
    private int heightInSm;
    private double priceInUAH;

    public Product() {
        this(null, null, 0, 0);
    }

    public Product(String typeOfProduct, String color, int heightInSm, double priceInUAH) {
        this.typeOfProduct = typeOfProduct;
        this.color = color;
        this.heightInSm = heightInSm;
        this.priceInUAH = priceInUAH;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeightInSm() {
        return heightInSm;
    }

    public void setHeightInSm(int heightInSm) {
        this.heightInSm = heightInSm;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }
}
