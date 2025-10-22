/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class SachTieuThuyet extends Sach implements kiemke {
    private boolean laSachSeries;

    public SachTieuThuyet(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
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
               ", Là series: " + laSachSeries + 
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
