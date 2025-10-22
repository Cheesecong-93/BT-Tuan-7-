package javaapplication28sach;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiDanhSach() {
        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
