package Hai_Dang_BT_Tuan_7;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(sach s) {
        danhSachSach.add(s);
    }

    public void hienThiTatCa() {
        for (sach s : danhSachSach) {
            System.out.println(s);
        }
    }
}
