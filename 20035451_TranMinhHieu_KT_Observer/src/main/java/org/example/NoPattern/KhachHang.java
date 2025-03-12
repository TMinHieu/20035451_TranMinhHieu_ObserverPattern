package org.example.NoPattern;

public class KhachHang {
    private String ten;

    public KhachHang(String ten) {
        this.ten = ten;
    }

    public void nhanThongBao(String trangThai) {
        System.out.println("Khach hang " + ten + " nhan thong bao: Phong hat hien tai " + trangThai);
    }
}

