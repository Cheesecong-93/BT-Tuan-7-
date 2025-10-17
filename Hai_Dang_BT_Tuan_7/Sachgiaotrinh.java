package Hai_Dang_BT_Tuan_7;

public class Sachgiaotrinh extends sach {
    private String monHoc;

    public Sachgiaotrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Mon hoc: " + monHoc +
                ", Gia ban: " + tinhGiaBan();
    }
}
