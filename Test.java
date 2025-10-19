package BaiTap_Tuan7;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach(); // Tạo đối tượng quản lý sách

        // Tạo sách giáo trình và tiểu thuyết
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT201", "Python Co Ban", "Nguyen Van D", "NXB Cong Nghe", 2020, 90000.0, "Lap trinh", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT201", "Game of Thrcones", "George R.R. Martin", "NXB My", 2010, 150000, "Tieu Thuyet", true);

        // Thêm sách vào quản lý
        ql.themSach(sg1);
        ql.themSach(st1);

        System.out.println("===== DANH SACH SACH DA THEM =====");
        ql.xuatTatCa();

        // Kiểm tra chức năng IKiemKe với sách tiểu thuyết
        System.out.println("\n--- Test chuc nang IKiemKe voi sach tieu thuyet ---");
        IKiemKe kiemKeTT = st1;

        int soLuongCanKiem = 150;
        boolean duHang = kiemKeTT.kiemTraTonKho(soLuongCanKiem);
        System.out.println("Ton kho >= " + soLuongCanKiem + " ? " + (duHang ? "Du hang" : "Thieu hang"));

        soLuongCanKiem = 100;
        duHang = kiemKeTT.kiemTraTonKho(soLuongCanKiem);
        System.out.println("Ton kho >= " + soLuongCanKiem + " ? " + (duHang ? "Du hang" : "Thieu hang"));

        kiemKeTT.capNhatViTri("Kho C3 - Ke 7");

        // Kiểm tra interface với sách giáo trình
        System.out.println("\n--- Test chuc nang IKiemKe voi sach giao trinh ---");
        IKiemKe kiemKeSG = sg1;
        kiemKeSG.capNhatViTri("Khu vuc Lap Trinh - Tang 2");
    }
}
