package BaiTap_Tuan7; 

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;      
    private boolean laSachSeries; 
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }
    @Override
    public double tinhGiaBan() {
        double phuPhiSeries = laSachSeries ? 15000.0 : 0;
        return getGiaCoBan() + phuPhiSeries;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách [" + getTieuDe() + "] đến khu vực: " + viTriMoi + ".");
    }
    @Override
    public String toString() {
        String isSeries = laSachSeries ? "Co" : "Khong";
        return "Ma sach: " + getMaSach() + 
               "\nTieu de: " + getTieuDe() +
               "\nTac gia: " + getTacGia() +
               "\nNam xuat ban: " + getNamXuatBan() +
               "\nSo luong: " + getSoLuong() +
               "\nGia co ban: " + getGiaCoBan() +
               "\nThe loai: " + theLoai +
               "\nLa sach series: " + isSeries +
               "\nGia ban uoc tinh: " + tinhGiaBan() + " VND" +
               "\n----------------------";
    }
}