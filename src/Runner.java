import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        PackageSimulator pa = new PackageSimulator();
        while (choice != 4){
            System.out.println("-----------------------------------\nWhat would you like to do?\n1. Calculate cost of one package\n2. Simulate Packages\n3. How package costs are calculated\n4. Quit");
            System.out.print("Input: ");
            choice = s.nextInt();
            if (choice == 1){
                System.out.println("-----------------------------------");
                System.out.print("Enter the zip code of origin package: ");
                int zip1 = s.nextInt();
                System.out.print("Enter the zip code of destination package: ");
                int zip2 = s.nextInt();
                System.out.print("Enter the weight of the package: ");
                double weight = s.nextDouble();
                System.out.print("Enter the height of the package: ");
                double height = s.nextDouble();
                System.out.print("Enter the length of the package: ");
                double length = s.nextDouble();
                System.out.print("Enter the width of the package: ");
                double width = s.nextDouble();
                Package p = new Package(zip1, zip2, weight, length, width, height);
                System.out.println("Cost: " + PackageCalculator.getCost(p.getDiff(), p.getWeight(), p.getHeight(), p.getLength(), p.getWidth()));
            }
            if (choice == 2){
                System.out.print("How many packages would you like to simulate? ");
                int num = s.nextInt();
                pa.generatePackages(num);
                System.out.println(pa.runSimulation());
            }
            if (choice == 3){
                System.out.println("The base cost for shipping is $3.75\nThere is a 5 cent charge for every tenth of a pound\n" +
                        "Then the difference between county codes is divided by 100 and added to the total\n\nOversized Packages Fees:\nAny package that exceeds a combined 36 inches will cost an additional 10 cents per inch.\n" +
                        "Additionally, packages that are more than 40 pounds will be charged 10 cents per tenth of a pound over the 40 pound limit.\n");
            }
        }

    }
}
