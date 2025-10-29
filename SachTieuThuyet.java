public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int soLuong, double giaCoBan, String theLoai) {
        super(maSach, tieuDe, tacGia, soLuong, giaCoBan);
        this.theLoai = theLoai;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển tiểu thuyết \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Sách Tiểu Thuyết] " + super.toString() + ", Thể loại: " + theLoai +
               ", Giá bán: " + tinhGiaBan();
    }
}