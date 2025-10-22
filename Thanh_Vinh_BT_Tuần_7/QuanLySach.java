/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiDanhSachSach() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("→ Giá bán ước tính: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("----------------------------------");
        }
    }
}
