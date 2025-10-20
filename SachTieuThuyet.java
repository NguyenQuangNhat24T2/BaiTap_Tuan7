package BaiTap_Tuan7;
public class SachTieuThuyet extends Sach implements IKiemKe 
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet() {}
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    // Getter & Setter
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }
    // Ghi đè phương thức trừu tượng
    @Override
    public double tinhGiaBan() 
    {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }
    // Giao diện
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return getSoLuong() >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }
    @Override
    public String toString() 
    {
        return super.toString() +
               "The loai: " + theLoai + "\n" +
               "La sach series: " + (laSachSeries ? "Co" : "Khong") + "\n" +
               "Gia ban uoc tinh: " + tinhGiaBan() + " VND\n";
    }
}