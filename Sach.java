package BaiTap_Tuan7;
public abstract class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // thêm mới
    // Constructor mặc định
    public Sach() {}
    // Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    // Getter & Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }
    // Phương thức trừu tượng
    public abstract double tinhGiaBan();
    @Override
    public String toString() 
    {
        return "Ma sach: " + maSach + "\n" +
               "Tieu de: " + tieuDe + "\n" +
               "Tac gia: " + tacGia + "\n" +
               "Nam xuat ban: " + namXuatBan + "\n" +
               "So luong: " + soLuong + "\n" +
               "Gia co ban: " + giaCoBan + " VND\n";
    }
}