package BaiTap_Tuan7;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;
    private int soLuong;
    private String viTriKho;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, String nhaXuatBan,
                          int namXuatBan, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, nhaXuatBan, namXuatBan, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
        this.soLuong = 30; // mặc định
        this.viTriKho = "Chua xac dinh";
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "SachTieuThuyet { " + super.toString()
                + ", The loai: " + theLoai
                + ", La series: " + (laSachSeries ? "Co" : "Khong")
                + ", Gia ban: " + tinhGiaBan()
                + ", So luong: " + soLuong
                + ", Vi tri: " + viTriKho
                + " }";
    }

    // IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongCan) {
        return this.soLuong >= soLuongCan;
    }

    @Override
    public void capNhatViTri(String viTri) {
        this.viTriKho = viTri;
        System.out.println("Vi tri sach tieu thuyet '" + getTenSach() + "' da duoc cap nhat: " + viTriKho);
    }
}
