
package BaiTap_Tuan7;
import java.util.ArrayList;

public class QuanLySach 
{
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach sach) 
    {
        danhSachSach.add(sach);
    }

    public void hienThiDanhSachSach() 
    {
        for (Sach sach : danhSachSach) 
        {
            System.out.println(sach.toString());
            System.out.println("Gia ban uoc tinh: " + sach.tinhGiaBan() + " VND");
            System.out.println("------------------------------------");
        }
    }
}
