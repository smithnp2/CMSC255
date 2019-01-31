/* MetalArt.java
****************************************************
* Project 2
****************************************************
* This project will ask the user for the name 
* of their sculpture, as well as the length,
* height, and width of the rectangular prism.
* Then it will use formulas to calculate the surface 
* area of each regular triangular pyramid
* as well as the rectangular prism.  
* It will then use the areas to calculate the
* cost of building a model of the sculpture
****************************************************
* Nathaniel Smith
* 1/30/19
* CMSC 255 - 004
****************************************************
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class MetalArt
{
	public static void main(String[] args)
	{
	
	Scanner scnr = new Scanner(System.in);
	
	
	/***********************************************
	* get inputs from user and assign variables for the name of 
	* the pentagon as well as the lengths and heights for the 
	* pyramids, and the length, height, and width of the prism
	***********************************************/
	
	System.out.println("Enter the name of the pentagon: ");
	String namePent = scnr.nextLine();
	
	System.out.println("Enter the length of the base of the first pyramid (inches): ");
	double baseLenPyr1 = scnr.nextDouble();
	
	System.out.println("Enter the height of the first pyramid (inches): ");
	double heightPyr1 = scnr.nextDouble();
	
	System.out.println("Enter the length of the base of the second pyramid (inches): ");
	double baseLenPyr2 = scnr.nextDouble();
	
	System.out.println("Enter the height of the second pyramid (inches): ");
	double heightPyr2 = scnr.nextDouble();
	
	System.out.println("Enter the height of the rectangular prism (inches): ");
	double heightPrism = scnr.nextDouble();
	
	System.out.println("Enter the length of the rectangular prism (inches): ");
	double lengthPrism = scnr.nextDouble();
	
	System.out.println("Enter the width of the rectangular prism (inches): ");
	double widthPrism = scnr.nextDouble();
	
	
	
	/***********************************************
	* set calculations for surface area of a triangular pyramid,
	* area of the base of the pyramid, the slant length, the
	* surface area of a rectangular prism, as well as creating
	* variables for the cost of the material, and the price of the sculpture
	***********************************************/
	
	double baseAreaPyr1 = 0.5 * baseLenPyr1 * Math.sqrt(Math.pow(baseLenPyr1, 2) - Math.pow((0.5 * baseLenPyr1), 2));
	
	double baseAreaPyr2 = 0.5 * baseLenPyr2 * Math.sqrt(Math.pow(baseLenPyr2, 2) - Math.pow((0.5 * baseLenPyr2), 2));
	
	double slantLenPyr1 = Math.sqrt(Math.pow(0.5 * baseLenPyr1, 2) + Math.pow(heightPyr1, 2));
	
	double slantLenPyr2 = Math.sqrt(Math.pow(0.5 * baseLenPyr2, 2) + Math.pow(heightPyr2, 2));
	
	double pyr1SurfaceArea = baseAreaPyr1 + 0.5 * (3 * baseLenPyr1 * slantLenPyr1);
	
	double pyr2SurfaceArea = baseAreaPyr2 + 0.5 * (3 * baseLenPyr2 * slantLenPyr2);
	
	double prismSurfaceArea = (2 * lengthPrism * widthPrism) + (2 * lengthPrism * heightPrism) + (2 * widthPrism * heightPrism);
	
	double totalSurfaceArea = (pyr1SurfaceArea + pyr2SurfaceArea + prismSurfaceArea);
	
	double totalMaterialCost = (totalSurfaceArea * 1.67);
	
	
	/***********************************************
	* print outputs of data inputs and calculations
	***********************************************/
	
	DecimalFormat df = new DecimalFormat("###,###.00");
	System.out.println("The " + namePent + " surface area calculations are: ");
		System.out.println("Surface area of the first pyramid: " + df.format((double)pyr1SurfaceArea) + " square inches");
		System.out.println("Surface area of the second pyramid: " + df.format((double)pyr2SurfaceArea) + " square inches");
		System.out.println("Surface area of the rectangular prism: " + df.format((double)prismSurfaceArea) + " square inches");
		System.out.println("Total Surface area: " + df.format((double)totalSurfaceArea) + " square inches");
	System.out.println("The total cost of the material to build " + namePent + " is: $" + df.format(totalMaterialCost));

	
	
	
	
	
	
	
	
	
	}
}