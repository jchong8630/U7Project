import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
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
                int weight = s.nextInt();
                System.out.print("Enter the height of the package: ");
                int height = s.nextInt();
                System.out.print("Enter the length of the package: ");
                int length = s.nextInt();
                System.out.print("Enter the width of the package: ");
                int width = s.nextInt();
                Package p = new Package(zip1, zip2, weight, length, width, height);
                System.out.println(p.getHeight());
            }
        }
        Address a = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        Address b = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 23451");

    }
}
