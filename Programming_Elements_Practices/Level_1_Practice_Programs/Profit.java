// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

import java.util.*;

public class Profit {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int cost_price = s1.nextInt();
        int selling_price = s1.nextInt();
        double profit = selling_price - cost_price;
        double profit_percentage = profit / cost_price * 100;

        System.out.println("the profit percentage is : " + profit_percentage);
    }
}
