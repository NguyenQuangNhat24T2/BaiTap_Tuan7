package BaiTap_Tuan7; 

public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach qlSach = new QuanLySach();
        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh("GT01", "Cau truc du lieu", "Tran Thi B", 2023, 50, 
                                                     80000.0, 
                                                     "Khoa hoc may tinh", "Dai hoc");
        qlSach.themMoi(sGiaoTrinh);
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet("TT01", "Nha gia kim", "Paulo Coelho", 1988, 100, 
                                                        120000.0,
                                                        "Huyen ao", false);
        qlSach.themMoi(sTieuThuyet);
        SachTieuThuyet sTieuThuyetSeries = new SachTieuThuyet("TT02", "Harry Potter: Hon da phu thuy", "J. K. Rowling", 1997, 75, 
                                                              150000.0, 
                                                              "Huyen ao", true);
        qlSach.themMoi(sTieuThuyetSeries);
        qlSach.hienThiDanhSach();
        System.out.println("--- KIEM TRA GIAO DIEN IKiemKe ---");
        IKiemKe kiemKe = sGiaoTrinh; 
        int soLuongToiThieu = 100;
        boolean duTonKho = kiemKe.kiemTraTonKho(soLuongToiThieu);
        System.out.println("Sách '" + sGiaoTrinh.getTieuDe() + "' có đủ " + soLuongToiThieu + " cuốn? " + (duTonKho ? "Co" : "Khong"));
        kiemKe.capNhatViTri("Kho A1-Ke 5"); 
        IKiemKe kiemKeTieuThuyet = sTieuThuyet;
        soLuongToiThieu = 50;
        duTonKho = kiemKeTieuThuyet.kiemTraTonKho(soLuongToiThieu); 
        System.out.println("Sách '" + sTieuThuyet.getTieuDe() + "' có đủ " + soLuongToiThieu + " cuốn? " + (duTonKho ? "Co" : "Khong"));
        kiemKeTieuThuyet.capNhatViTri("Kho B2-Kệ 10");
        System.out.println("\n--- XOA SACH ---");
        qlSach.xoaTheoMa("TT02");
        qlSach.hienThiDanhSach();
    }
}