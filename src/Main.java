import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tipc calculator!");

        int peopleQuantity;
        double tipPercent;
        double totalCost;
        double singleCost;
        System.out.println("What will the tpip eprcentage be? >");

        System.out.println("Please enter the cost of each individual item purchased, to end and calculate enter -1");
        double temp = scan.nextDouble();
        singleCost += temp;
        while (singleCost != -1){
            System.out.println("Please enter the cost of each individual item purchased, to end and calculate enter -1");
            temp = scan.nextDouble();
            singleCost += temp;
        }
        System.out.print(singleCost);
    }
}