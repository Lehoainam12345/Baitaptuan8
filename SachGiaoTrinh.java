package Baitaptuan6;

public class SachGiaoTrinh extends Sach implements IkiemKe,IGiaBan{
    private String monHoc;
    private String capDo;
    private String viTri;
    public SachGiaoTrinh(){
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,String capDo,String monHoc,String viTri){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
        this.capDo=capDo;
        this.monHoc=monHoc;
        this.viTri=viTri;
    }
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap monHoc: ");
        this.monHoc=super.sc.nextLine();
        System.out.println("Nhap capDo: ");
        this.capDo=super.sc.nextLine();
        System.out.println("viTri: ");
        this.viTri=super.sc.nextLine();
    }
    public String toString(){
        return super.toString()+" /monHoc="+this.monHoc+" /capDo="+this.capDo+" /giaban="+this.tinhGiaBan()+" /viTri="+this.viTri;
    }
    @Override 
    public double tinhGiaBan(){
        double sonamxuatban=2025 - namXuatBan;
        return super.giaCoBan + (sonamxuatban * 5.000);
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        if (soLuong >= soLuongToiThieu)
            return true;
        else
            return false;
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("monHoc: "+this.monHoc);
        System.out.println("capDo: "+this.capDo);
        System.out.println("GiaBanUocTinh: "+this.tinhGiaBan());
        System.out.println("viTri: "+this.viTri);

    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }
}
