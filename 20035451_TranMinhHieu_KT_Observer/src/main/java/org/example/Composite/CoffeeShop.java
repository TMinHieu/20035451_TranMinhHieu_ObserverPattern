package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product coffee = new Product("Ca phe", 25000);
        Product tea = new Product("Tra sua", 35000);
        Product water = new Product("Nuoc suoi", 10000);

        // Tạo bàn và thêm sản phẩm
        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(tea);

        Table table2 = new Table(2);
        table2.addItem(coffee);
        table2.addItem(coffee);
        table2.addItem(water);

        // Danh sách bàn trong quán
        List<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);

        // Tính tổng doanh thu
        double totalRevenue = tables.stream().mapToDouble(Table::getPrice).sum();

        // Hiển thị kết quả
        tables.forEach(System.out::println);
        System.out.println("Tong doanh thu quan ca phe: " + totalRevenue + " VND");
    }
}
