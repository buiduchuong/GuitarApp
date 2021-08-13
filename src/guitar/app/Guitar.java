package guitar.app;

public class Guitar {
    private String serialNumber;
    private GuitarSpec guitarSpec;
    private double price;

    public Guitar() {
    }

    public Guitar(String serialNumber, GuitarSpec guitarSpec, double price) {
        this.serialNumber = serialNumber;
        this.guitarSpec = guitarSpec;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    @Override
    public String toString() {
        return "Guitar [guitarSpec=" + guitarSpec + ", price=" + price + ", serialNumber=" + serialNumber + "]";
    }

}
