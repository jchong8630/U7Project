import java.util.ArrayList;

public class PackageSimulator {
    ArrayList<Package> packages;

    public PackageSimulator(){
        packages = new ArrayList<>();
    }
    public void generatePackages(int num){
        for (int i = 0; i < num; i++){
            int zip = (int) (Math.random() * 99449) + 501;
            int zip2 = (int) (Math.random() * 99449) + 501;
            double weight  = (Math.random() * 50) + .5;
            double height = (Math.random() * 20) + .5;
            double length = (Math.random() * 20) + .5;
            double width = (Math.random() * 20) + .5;
            Address a = new Address("123 Random Street Apt 3C, City, State " + zip);
            Address b = new Address("123 Random Street Apt 3C, City, State " + zip2);
            Package p = new Package(a, b, zip, zip2, weight, length, width, height);
            packages.add(p);
        }
    }

    public void resetSimulation(){
        packages.clear();
    }

    public String runSimulation(){
        String str = "";
        for (int i = 0; i < packages.size(); i++){
            Package p = packages.get(i);
            double cost = PackageCalculator.getCost(packages.get(i));
            str += "\nPackage " + (i + 1) + ":_________________________________________\nOrigin Address: " + p.getOrigin() + "\nDestination Address: " + p.getDestination() + "\nWeight: " + p.getWeight() + "\nHeight: " + p.getHeight() + "\nLength: " + p.getLength() + "\nWidth: "
                    + p.getWeight() + "\nCost: " + cost + "\n";
        }
        return str;
    }


    public ArrayList<Package> getPackages() {
        return packages;
    }
}
