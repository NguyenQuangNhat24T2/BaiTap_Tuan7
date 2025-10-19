package BaiTap_Tuan7;
public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT001", "Lap Trinh Java", "Nguyen Van A",
                2022, 10, 50000, "Lap trinh", "Dai hoc");

        SachTieuThuyet st1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling",
                2000, 5, 80000, "Fantasy", true);
        ql.themSach(sg1);
        ql.themSach(st1);
        System.out.println("=== DANH SACH SACH ===");
        ql.hienThiDanhSach();
        // Kiểm tra giao diện IKiemKe
        System.out.println("=== KIEM TRA GIAO DIEN IKiemKe ===");
        IKiemKe kiemKe = sg1;
        System.out.println("Ton kho >= 100? " + (kiemKe.kiemTraTonKho(100) ? "Du" : "Khong du"));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}