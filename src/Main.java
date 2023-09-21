import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tipc calculator!");

        int peopleQuantity;
        double tipPercent;
        double totalCost = 0;
        double modNum= 0.2;
        double roundNum = 0.5;
        double incrementNum = 0.1
        double singleCost;


        System.out.println("Please enter the cost of each individual item purchased, to end and calculate enter -1");
        double temp = scan.nextDouble();
        totalCost += temp;
        while (temp != -1){
            System.out.println("Please enter the cost of each individual item purchased, to end and calculate enter -1");
            temp = scan.nextDouble();
            total += temp;
        }

        totalCost += 1;
        singleCost = totalCost;
        singleCost *= 100;
        while ((singleCost % modNum) < roundNum){

        if

        System.out.print(singleCost);
    }
}