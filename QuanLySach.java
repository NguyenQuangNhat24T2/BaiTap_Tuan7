package BaiTap_Tuan7;
import java.util.ArrayList;
import java.util.List;
public class QuanLySach 
{
    private List<Sach> danhSach = new ArrayList<>();
    public void themSach(Sach s) 
    {
        danhSach.add(s);
    }
    public void hienThiDanhSach() 
    {
        for (Sach s : danhSach) 
        {
            System.out.println(s.toString());
            System.out.println("----------------------");
        }
    }
}
