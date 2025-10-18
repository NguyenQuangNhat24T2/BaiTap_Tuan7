/**Giao dien Interface (Can-Do relationship)**/

public interface IKiemKe
{
    boolean kiemTraTonKho(int soLuongToiThieu);
    /*true (nghĩa là "Đúng" / "Có" / "Bật") / false (nghĩa là "Sai" / "Không" / "Tắt") */
    void capNhatViTri(String viTriMoi);
}

