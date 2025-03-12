package org.example.NoPattern;

public class Main {
    public static void main(String[] args) {
        PhongHat phong = new PhongHat();

        KhachHang khach1 = new KhachHang("Hung");
        KhachHang khach2 = new KhachHang("Linh");
        KhachHang khach3 = new KhachHang("Hieu");
        KhachHang khach4 = new KhachHang("Khoi");

        phong.dangKyKhach(khach1);
        phong.dangKyKhach(khach2);
        phong.dangKyKhach(khach3);
        phong.dangKyKhach(khach4);

        // Khi trạng thái thay đổi, tất cả khách hàng sẽ nhận thông báo
        phong.setTrangThai("Da duoc dat");
        phong.setTrangThai("Trong");
    }
}

