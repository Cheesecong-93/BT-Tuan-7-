/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh gt = new SachGiaoTrinh("Lập trình Java", "Nguyễn Văn A", 2020, 150, 80000);
        SachTieuThuyet tt = new SachTieuThuyet("Harry Potter", "J.K. Rowling", 2015, 50, 100000, true);

        ql.themSach(gt);
        ql.themSach(tt);

        System.out.println("===== DANH SÁCH SÁCH =====");
        ql.hienThiDanhSachSach();

        System.out.println("\n===== KIỂM TRA GIAO DIỆN IKiemKe =====");
        kiemke kiemKe = new SachGiaoTrinh("Toán Cao Cấp", "Trần Văn B", 2018, 200, 60000);
        System.out.println("Đủ tồn kho 100? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}
