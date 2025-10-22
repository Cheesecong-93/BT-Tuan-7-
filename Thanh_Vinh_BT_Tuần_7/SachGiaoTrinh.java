/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class SachGiaoTrinh extends Sach implements kiemke {

    public SachGiaoTrinh(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
