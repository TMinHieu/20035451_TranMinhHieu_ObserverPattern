package org.example;

public class StockMarketObserver {
    public static void main(String[] args) {
        // Tạo cổ phiếu
        ConcreteStock stock = new ConcreteStock("Apple", 150.0);

        // Tạo nhà đầu tư
        Investor investor1 = new ConcreteInvestor("Nha dau tu A");
        Investor investor2 = new ConcreteInvestor("Nha dau tu B");

        // Đăng ký theo dõi cổ phiếu
        stock.attach(investor1);
        stock.attach(investor2);

        // Giá cổ phiếu thay đổi
        stock.setPrice(155.0);
        stock.setPrice(160.5);

        // Một nhà đầu tư ngừng theo dõi
        stock.detach(investor1);

        // Giá cổ phiếu thay đổi tiếp
        stock.setPrice(165.0);
    }
}

