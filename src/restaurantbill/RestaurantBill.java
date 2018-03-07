/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantbill;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author erhal8376
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double mealCost;
        
        try (Scanner reader = new Scanner(System.in) // Reading from System.in
        ) {
            System.out.println("--------------------\nEnter meal cost:\n--------------------");
            mealCost = reader.nextDouble();
        }
        
        mealCost = Math.round(mealCost * 100);
        mealCost = mealCost / 100;
        
        double tax = 0.13 * mealCost;
        tax = Math.round(tax * 100);
        tax = tax / 100;
        
        double total = tax + mealCost;
        
        total = Math.round(total * 100);
        total = total / 100;

        System.out.println("--------------------\nMeal:\t$" + mealCost + "\n" + "HST:\t$" + tax + "\n" + "Total:\t$" + total);
    }
    
}
