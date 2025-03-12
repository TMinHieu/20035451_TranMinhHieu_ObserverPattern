package org.example.NoPattern;

import java.util.ArrayList;
import java.util.List;

public class PhongHat {
    private String trangThai;
    private List<KhachHang> danhSachKhachHang = new ArrayList<>();

    public void dangKyKhach(KhachHang khach) {
        danhSachKhachHang.add(khach);
    }

    public void huyDangKy(KhachHang khach) {
        danhSachKhachHang.remove(khach);
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
        thongBaoChoKhach();
    }

    private void thongBaoChoKhach() {
        for (KhachHang khach : danhSachKhachHang) {
            khach.nhanThongBao(trangThai);
        }
    }
}

