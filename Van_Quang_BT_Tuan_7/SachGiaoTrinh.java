package javaapplication28sach;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String nganhHoc;
    private String trinhDo;

    // ✅ Constructor đầy đủ (8 tham số)
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong, double giaCoBan,
                         String nganhHoc, String trinhDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.nganhHoc = nganhHoc;
        this.trinhDo = trinhDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Ngành: " + nganhHoc +
               ", Trình độ: " + trinhDo +
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }
}
