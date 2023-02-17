public class PackageCalculator {
    public static double getCost(int diff, double weight, double height, double length, double width){
        double cost = 3.75;
        cost += (weight * 10) * .05;
        cost += diff / 100.0;
        if (height + length + width > 36){
            cost += (height + length + width - 36) * 0.1;
        }
        if (weight > 40){
            cost += weight - 40;
        }
        return cost;
    }

    public static double getCost(Package p){
        double cost = 3.75;
        cost += (p.getWeight() * 10) * .05;
        cost += p.getDiff() / 100.0;
        if (p.getHeight() + p.getLength() + p.getWidth() > 36){
            cost += (p.getHeight() + p.getLength() + p.getWidth() - 36) * 0.1;
        }
        if (p.getWeight() > 40){
            cost += p.getWeight() - 40;
        }
        cost = Math.round(cost * 100.00) / 100.00;
        return cost;
    }
}
