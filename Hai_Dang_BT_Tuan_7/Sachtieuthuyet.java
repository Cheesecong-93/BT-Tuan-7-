package Hai_Dang_BT_Tuan_7;

public class Sachtieuthuyet extends sach {
    private boolean laSachSeries;

    public Sachtieuthuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,int soLuong, double giaCoBan, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        if (laSachSeries) {
            return giaCoBan + 15000;
        } else {
            return giaCoBan;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", La sach series: " + (laSachSeries ? "Co" : "Khong") +
                ", Gia ban: " + tinhGiaBan();
    }
}
