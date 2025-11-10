/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
//test class
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import demoproductsales.ProductSales;

/**
 *
 * @author lab_services_student
 */
public class TestProductSales {

    ProductSales test = new ProductSales();

    public TestProductSales() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        // Test data: 2D array of product sales
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Calculate total sales using the method
        int totalSales = test.TotalSales(productSales);

        // Use assertEquals to check if the result is correct
        assertEquals(2200, totalSales, "The total sales should be 2200");
    }

    @Test
    public void AverageSalesw_ReturnsAverageProductSales() {
        // Test data: 2D array of product sales
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Calculate average sales using the method
        double averageSales = test.AverageSales(productSales);

        // Use assertEquals to check if the result is correct
        // Allow for a small delta when comparing floating-point numbers
        assertEquals(366.67, averageSales, 0.01, "The average sales should be 366.67");
    }
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
