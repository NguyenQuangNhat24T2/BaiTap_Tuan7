public abstract class Sach
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach(){}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach()
    {
        return maSach;
    }
    public void setMaSach(String maSach)
    {
        this.maSach = maSach;
    }

    public String getTieuDe()
    {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe)
    {
        this.tieuDe = tieuDe;
    }

    public String getTacGia()
    {
        return tacGia;
    }
    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan()
    {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }

    public double getGiaCoBan()
    {
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan)
    {
        this.giaCoBan = giaCoBan;
    }

    /** Them pt truu tuong:
     * Phương thức trừu tượng để tính giá bán cuối cùng của cuốn sách.
     * Các lớp con BẮT BUỘC phải định nghĩa (implement) cách tính của riêng mình.
     */

    public abstract double tinhGiaBan(); /*trien khai o lop con!! */

     /**Trong Java, mọi lớp (class) mà em tạo ra, dù em có viết extends hay không, đều ngầm kế thừa từ một "siêu lớp cha" tên là Object.
Lớp Object này có sẵn một hàm toString() của riêng nó. Vì vậy, ở đây em đang @Override (ghi đè) cái hàm toString() của lớp Object. */
    @Override
    public String toString()
    {
        return 
        "Ma Sach: "+maSach+"\n"+
        "Tieu De: "+tieuDe+"\n"+
        "Tac Gia: "+tacGia+"\n"+
        "Nam Xuat Ban: "+namXuatBan+"\n"+
        "So Luong: "+soLuong+"\n"+
        "Gia Co Ban: "+giaCoBan+"\n";
    }
}
