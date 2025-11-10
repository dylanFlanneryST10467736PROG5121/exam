/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproductsales;

/**
 *
 * @author lab_services_student
 */
//Class implemnting interface class
public class ProductSales implements IProduct {

    private int[][] productSales;

    //Method to calc total sales
    @Override
    public int TotalSales(int[][] productSales) {
        int totalSales = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                totalSales += productSales[row][col];

            }

        }

        return totalSales;
    }

    ;
    //method to calc average sales
    @Override
    public double AverageSales(int[][] productSales) {
        int totalSales = TotalSales(productSales);
        return (double) totalSales / 6;

    }

    ;
    //Method to calc max sales
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col];

                }

            }

        }
        return max;
    }

    ;
    //Method to calc min sale
    @Override
    public int MinSale(int[][] productSales) {

        int min = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col];

                }

            }

        }
        return min;
    }
;

}
