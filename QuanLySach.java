package BaiTap_Tuan7;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> ds;

    public QuanLySach() {
        ds = new ArrayList<>();
    }

    public void themSach(Sach s) {
        ds.add(s);
    }

    public boolean xoaTheoMa(String ma) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSach().equals(ma)) {
                ds.remove(i);
                return true;
            }
        }
        return false;
    }

    public Sach timTheoMa(String ma) {
        for (Sach s : ds) {
            if (s.getMaSach().equals(ma)) {
                return s;
            }
        }
        return null;
    }

    public boolean capNhat(String ma, Sach sMoi) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSach().equals(ma)) {
                sMoi.setMaSach(ma);
                ds.set(i, sMoi);
                return true;
            }
        }
        return false;
    }

    public void xuatTatCa() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach sach rong.");
            return;
        }
        System.out.println("Danh sach sach:");
        for (Sach s : ds) {
            System.out.println(s);
        }
    }

    public void hienThiDanhSach() {
        xuatTatCa();
    }
}
