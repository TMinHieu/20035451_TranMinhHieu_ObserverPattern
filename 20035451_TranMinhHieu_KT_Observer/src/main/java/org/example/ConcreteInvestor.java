package org.example;

class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " nhan duoc thong bao: Gia co phieu " + stockName + " hien tai la $" + price);
    }
}
