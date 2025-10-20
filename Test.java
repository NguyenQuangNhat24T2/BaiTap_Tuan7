package BaiTap_Tuan7;
public class Test
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh("GT01", "Cau Truc DU lieu & Giai Thuat", "Hoang Thi My Le", 2020, 120, 80000, "Cong Nghe Thong Tin");
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet("TT01", "Nha Gia Kim", "J.K. Rowling", 2018, 80, 90000, false);

        ql.themSach(sGiaoTrinh);
        ql.themSach(sTieuThuyet);

        ql.hienThiDanhSachSach();

        // Kiểm tra giao diện
        IKiemKe kiemKe = sGiaoTrinh;
        System.out.println("Kiem tra ton kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}
