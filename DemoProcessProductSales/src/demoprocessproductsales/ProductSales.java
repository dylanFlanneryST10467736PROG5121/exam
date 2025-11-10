/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoprocessproductsales;

/**
 *
 * @author lab_services_student
 */
public class ProductSales {
    //Method to return total sales

    public int GetProductSales(int[][] productSales) {
        int totalSales = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                totalSales += productSales[row][col];

            }

        }

        return totalSales;
    }

    ;
     //Method to return average sales
     public double AverageSales(int[][] productSales) {
        int totalSales = GetProductSales(productSales);
        return (double) totalSales / 6;

    }

    ;
     //method to return sales over the limit
     public int salesOverLimit(int[][] productSales) {
        int limit = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > 500) {
                    limit++;
                }

            }

        }
        return limit;

    }

    ;
     //method to return sales under limit
      public int salesUnderLimit(int[][] productSales) {
        int limit = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > 500) {
                    limit++;
                }

            }

        }
        return limit;
    }
;
}
