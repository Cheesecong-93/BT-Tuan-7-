package javaapplication28sach;

public class TestMain {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh(
                "GT01", "Lập trình Java", "Nguyen Van A", 2023, 10, 50000, "CNTT", "Đại học");

        SachTieuThuyet st1 = new SachTieuThuyet(
                "TT01", "Harry Potter", "J.K. Rowling", 2015, 5, 80000, true);

        ql.themSach(sg1);
        ql.themSach(st1);

        ql.hienThiDanhSach();

        // Kiểm tra interface
        IKiemKe kiemKe = sg1;
        System.out.println("Kiểm tra tồn kho >= 5: " + kiemKe.kiemTraTonKho(5));
        kiemKe.capNhatViTri("Khu A1 - Rẽ 5");
    }
}
