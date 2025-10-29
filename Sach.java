public abstract class Sach implements IGiaBan, IKiemKe {
    private String tieuDe;
    private String maSach;
    private double giaCoBan;
    private int soLuongTon;
    private String viTri;

    public Sach(String tieuDe, String maSach, double giaCoBan, int soLuongTon, String viTri) {
        this.tieuDe = tieuDe;
        this.maSach = maSach;
        this.giaCoBan = giaCoBan;
        this.soLuongTon = soLuongTon;
        this.viTri = viTri;
    }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public int getSoLuongTon() { return soLuongTon; }
    public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuongTon >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách " + tieuDe + " đến khu vực: " + viTriMoi);
    }

    @Override
    public abstract String toString();
}
