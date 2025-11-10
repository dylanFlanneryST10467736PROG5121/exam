/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoproductsales;

/**
 *
 * @author lab_services_student
 */
public class DemoProductSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instantiation of class
        ProductSales sales = new ProductSales();
        //Declaring my 2 d array
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600},};
        //declaring variables needed for my application
        int total = sales.TotalSales(productSales);
        double average = sales.AverageSales(productSales);
        int max = sales.MaxSale(productSales);
        int min = sales.MinSale(productSales);
        long roundedAverage = Math.round(average);
//One d array for describing the sales
        String[] reportDescriptors = {"Total Sales: ", "Average Sales: ", "Maximum Sale: ", "Minimum Sale: "};
//printing the actual sales report
        System.out.println("PRODUCT SALES REPORT- 2025");
        System.out.println("------------------------------------");
        //Switch statemnt needed for iterating over the one d array and printing other values needed for the report
        for (int i = 0; i < reportDescriptors.length; i++) {
            switch (i) {
                case 0:
                    System.out.println(reportDescriptors[i] + total);
                    break;
                case 1:
                    System.out.println(reportDescriptors[i] + roundedAverage);
                    break;
                case 2:
                    System.out.println(reportDescriptors[i] + max);
                    break;
                case 3:
                    System.out.println(reportDescriptors[i] + min);
                    break;

            }

        }
        System.out.println("------------------------------------");
    }

}
