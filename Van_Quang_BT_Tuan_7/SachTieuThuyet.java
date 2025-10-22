package javaapplication28sach;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    // ✅ Constructor đầy đủ (7 tham số)
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          int namXuatBan, int soLuong, double giaCoBan,
                          boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Là sách series: " + laSachSeries +
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển tiểu thuyết \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }
}
