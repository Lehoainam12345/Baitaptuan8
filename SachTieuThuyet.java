package Baitaptuan6;

public class SachTieuThuyet extends Sach implements IkiemKe,IGiaBan{
    private String theLoai;
    private Boolean laSachSeries;
    private String viTri;
    public SachTieuThuyet(){
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,String theLoai,boolean laSachSeries, String viTri){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
        this.theLoai=theLoai;
        this.laSachSeries=laSachSeries;
        this.viTri=viTri;
    }
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap theLoai: ");
        this.theLoai=super.sc.nextLine();
        System.out.println("Nhap laSachSeries");
        this.laSachSeries = Boolean.parseBoolean(sc.nextLine());
        System.out.println("viTri: ");
        this.viTri=super.sc.nextLine();
    }
    public void hienThiThongTin (){
        super.hienThiThongTin();
        System.out.println("theLoai: "+this.theLoai);
        System.out.println("laSachSeries: "+this.laSachSeries);
        System.out.println("GiaBanUocTinh: "+this.tinhGiaBan());
        System.out.println("viTri: "+this.viTri);
    }
    public String toString(){
        return super.toString()+" /theLoai="+this.theLoai+" / laSachSeries="+this.laSachSeries+" /giaban="+this.tinhGiaBan()+" /viTri="+this.viTri;
    }@Override 
    public double tinhGiaBan(){
        if(laSachSeries=true)
            return super.giaCoBan+15.000;
        else
            return super.giaCoBan;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        if (soLuong >= soLuongToiThieu)
            return true;
        else
            return false;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }
}

