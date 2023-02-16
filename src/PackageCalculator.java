public class PackageCalculator {
    public double getCost(int diff, int weight, int height, int length, int width){
        double cost = 3.75;
        cost += weight / 0.1 * .05;
        cost += diff / 100;
        return cost;
    }
}
