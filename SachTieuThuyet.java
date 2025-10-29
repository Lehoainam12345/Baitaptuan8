public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, String maSach, double giaCoBan, int soLuongTon, String viTri, String theLoai) {
        super(tieuDe, maSach, giaCoBan, soLuongTon, viTri);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2;
    }

    @Override
    public String toString() {
        return "Sách Tiểu Thuyết - " + getTieuDe() +
                " | Thể loại: " + theLoai +
                " | Giá bán: " + tinhGiaBan();
    }
}
