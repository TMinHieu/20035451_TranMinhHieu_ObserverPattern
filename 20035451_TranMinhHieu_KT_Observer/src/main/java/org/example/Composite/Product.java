package org.example.Composite;

// Leaf: Sản phẩm đơn lẻ (Cà phê, Trà sữa, Nước suối, ...)
class Product implements Item {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price + " VND";
    }
}
