package Hai_Dang_BT_Tuan_7;

public class test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        sach s1 = new Sachgiaotrinh("GT01", "Giai tich 1", "Nguyen Van A", 2020, 10, 50000, "Toan");
        sach s2 = new Sachtieuthuyet("TT01", "Harry Potter", "J.K. Rowling", 2010, 5, 80000, true);
        sach s3 = new Sachtieuthuyet("TT02", "Tieng goi noi hoang da", "Jack London", 2022, 3, 60000, false);

        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);

        ql.hienThiTatCa();
    }
}
