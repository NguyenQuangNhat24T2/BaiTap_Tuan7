package BaiTap_Tuan7;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;
    private int soLuong;     
    private String viTriKho;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, String nhaXuatBan,
                         int namXuatBan, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, nhaXuatBan, namXuatBan, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
        this.soLuong = 50; // mặc định
        this.viTriKho = "Chua xac dinh";
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "SachGiaoTrinh { " + super.toString()
                + ", Mon hoc: " + monHoc
                + ", Cap do: " + capDo
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
        System.out.println("Vi tri sach giao trinh '" + getTenSach() + "' da duoc cap nhat: " + viTriKho);
    }
}
