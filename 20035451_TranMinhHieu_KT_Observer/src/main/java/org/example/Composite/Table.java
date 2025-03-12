package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

// Composite: Bàn trong quán, chứa nhiều sản phẩm
class Table implements Item {
    private int tableNumber;
    private List<Item> items = new ArrayList<>();

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Ban " + tableNumber + " - Tong tien: " + getPrice() + " VND";
    }
}
