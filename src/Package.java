public class Package {
    private Address origin;
    private Address destination;
    private int diff;
    private double weight;
    private double length;
    private double height;
    private double width;

    public Package(Address a, Address b, double w, double length, double width, double height){
        diff = Math.abs(a.getZip() / 100 - b.getZip() / 100);
        weight = w;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Package(int zip1, int zip2, double w, double length, double width, double height){
        diff = Math.abs(zip1 / 100 - zip2 / 100);
        weight = w;
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public int getDiff() {
        return diff;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean checker(){
        return length >= 2 && width >= 2 && height >= 2 && weight >= .1;
    }

}
