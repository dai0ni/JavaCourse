package app;

import data.*;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-US");
        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), Rating.NOT_RATED);

        pm.printProductReport(101);
        pm.parseReview("101,4,Nice hot cup of tea");

        System.out.println(ProductManager.getSupportedLocales()+"\n");

        pm.changeLocale("ru-RU");
        pm.printProductReport(101);
    }
}
