package BaiTap_Tuan7; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuanLySach {
    private List<Sach> danhSachSach; 
    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }
    
    public void themMoi(Sach sach) {
        if (timKiemTheoMa(sach.getMaSach()) != null) {
            System.out.println("(!) Loi: Ma sach '" + sach.getMaSach() + "' da ton tai.");
            return;
        }
        danhSachSach.add(sach);
        System.out.println("(+) Da them sach thanh cong.");
    }
        public boolean xoaTheoMa(String maSach) {
        Sach sachCanXoa = timKiemTheoMa(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("(-) Da xoa sach ma '" + maSach + "' thanh cong.");
            return true;
        }
        System.out.println("(!) Loi: Khong tim thay sach voi ma '" + maSach + "' de xoa.");
        return false;
    }
    public boolean capNhatTheoMa(String maSach, String tieuDeMoi, String tacGiaMoi, int namXuatBanMoi, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setTieuDe(tieuDeMoi);
            sachCanCapNhat.setTacGia(tacGiaMoi);
            sachCanCapNhat.setNamXuatBan(namXuatBanMoi);
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("(~) Da cap nhat sach ma '" + maSach + "' thanh cong.");
            return true;
        }
        System.out.println("(!) Loi: Khong tim thay sach voi ma '" + maSach + "' de cap nhat.");
        return false;
    }
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null; 
    }
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach hien dang trong.");
            return;
        }
        System.out.println("\n===== DANH SACH SACH =====");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString()); 
        }
        System.out.println("==========================\n");
    }
    public void hienThiThongTinSach(String maSach) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            System.out.println("\n===== THONG TIN SACH TIM DUOC =====");
            System.out.println(sach.toString()); 
            System.out.println("===================================\n");
        } else {
            System.out.println("(!) Khong tim thay sach voi ma: " + maSach);
        }
    }
}