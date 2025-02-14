import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double itemCost = 0;
       double shipCost = 0;
       double totalCost = 0;
       final double SHIP_RATE = 0.02;
       String trash = "";
        System.out.println("What is the item cost? ");
        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();
            if (itemCost >= 100){
                totalCost = itemCost * SHIP_RATE + itemCost;
                shipCost = itemCost * SHIP_RATE;
            }
            else{
                totalCost = itemCost;
                shipCost = 0;
            }
            System.out.println("The total cost: " + totalCost);
            System.out.println("The shipping cost is: " + shipCost);
        }
        else{
            trash = in.nextLine();
            System.out.println("Invalid item price: " + trash);
            System.exit(0);
        }


    }
}