
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luna
 */
public class PaintJobEstimator {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of rooms to be painted: ");
        double theNumberofrooms = keyboard.nextDouble();
        
        System.out.println("Enter the price of the paint per gallon: $");
        double thePriceofthepaint = keyboard.nextDouble();
        
        System.out.println("Enter the square feet of wall space in each room: ");
        double theSquarefeetofwall = keyboard.nextDouble();
        
        double theNumberofgallonsofpaint = (theNumberofrooms*theSquarefeetofwall)/115;
        System.out.println("The number of gallons of paint required: "+theNumberofgallonsofpaint);
        
        double theHoursoflabor = (theNumberofrooms*theSquarefeetofwall)/115*8;
        System.out.println("The hours of labor required: "+theHoursoflabor);
        
        double theCostofthepaint = (theNumberofrooms*theSquarefeetofwall)/115*thePriceofthepaint;
        System.out.println("The cost of the paint: $"+theCostofthepaint);
        
        double theLaborcharges = (theNumberofrooms*theSquarefeetofwall)/115*8*18;
        System.out.println("The labor charges: $"+theLaborcharges);
        
        double theTotalcost = theCostofthepaint+theLaborcharges;
        System.out.println("The total cost of the paint job: "+theTotalcost);
    
    }
}
