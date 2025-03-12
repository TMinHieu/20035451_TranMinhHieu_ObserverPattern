package org.example;

import java.util.ArrayList;
import java.util.List;

class ConcreteStock implements Stock {
    private String name;
    private double price;
    private List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void attach(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void detach(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(name, price);
        }
    }

    // Khi giá thay đổi, tự động thông báo
    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            System.out.println("📈 Gia co phieu " + name + " thay doi: " + price + " ➡ " + newPrice);
            this.price = newPrice;
            notifyInvestors();
        }
    }
}

