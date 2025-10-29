public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, tacGia, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách giáo trình \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Sách Giáo Trình] " + super.toString() + ", Môn học: " + monHoc +
               ", Giá bán: " + tinhGiaBan();
    }
}