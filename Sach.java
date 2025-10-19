package BaiTap_Tuan7;

public abstract class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private int namXuatBan;
    private double giaCoBan;

    public Sach(String maSach, String tenSach, String tacGia, String nhaXuatBan,
                int namXuatBan, double giaCoBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public String getNhaXuatBan() { return nhaXuatBan; }
    public void setNhaXuatBan(String nhaXuatBan) { this.nhaXuatBan = nhaXuatBan; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Ma sach: " + maSach
                + ", Ten sach: " + tenSach
                + ", Tac gia: " + tacGia
                + ", NXB: " + nhaXuatBan
                + ", Nam XB: " + namXuatBan
                + ", Gia co ban: " + giaCoBan;
    }
}
