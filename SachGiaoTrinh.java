public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String maSach, double giaCoBan, int soLuongTon, String viTri, String monHoc) {
        super(tieuDe, maSach, giaCoBan, soLuongTon, viTri);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    @Override
    public String toString() {
        return "Sách Giáo Trình - " + getTieuDe() +
                " | Môn: " + monHoc +
                " | Giá bán: " + tinhGiaBan();
    }
}
