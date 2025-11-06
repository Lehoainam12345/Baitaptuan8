package Baitaptuan6;

import java.util.Scanner;

public abstract class Sach implements IGiaBan,IkiemKe{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected Scanner sc;
    protected double giaCoBan; 
    public Sach (){
        sc =new Scanner(System.in);
    }
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
        this.giaCoBan=giaCoBan;
        sc =new Scanner(System.in);
    }
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
    }
    public Sach (String maSach, String tieuDe, String tacGia){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
    }
    public Sach (String maSach, String tieuDe ){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
    }
    public String getmasach(){
        return maSach;
    }
    public String gettieude(){
        return tieuDe;
    }
    public String gettacgia(){
        return tacGia;
    }
    public int getnamxuatban(){
        return namXuatBan;
    }
    public int getsoluong(){
        return soLuong;
    }
    public double getgiaCoBan(){
        return giaCoBan;
    }
    public void setmasach(String maSach){
        this.maSach=maSach;
    }
    public void settieude(String tieuDe){
        this.tieuDe=tieuDe;
    }
    public void settacgia(String tacGia){
        this.tacGia=tacGia;
    }
    public void setnamxuatban(int namXuatBan){
        this.namXuatBan=namXuatBan;
    }
    public void setsoLuong (int soLuong){
        this.soLuong=soLuong;
    }
    public void setgiaCoBan(double giaCoBan){
        this.giaCoBan=giaCoBan;
    }
    public void Nhap(){
        System.out.println("Nhap maSach: ");
        this.maSach=sc.nextLine();
        System.out.println("Nhap tieuDe: ");
        this.tieuDe=sc.nextLine();
        System.out.println("Nhap tacGia: ");
        this.tacGia=sc.nextLine();
        System.out.println("Nhap namXuatBan(<2026): ");
        this.namXuatBan=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap soLuong: ");
        this.soLuong=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap giaCoBan: ");
        this.giaCoBan=Double.parseDouble(sc.nextLine());
    }
    public String toString(){
        //thêm
        if (this.namXuatBan >= 2026) {
        System.out.println("Nam xuat ban khong hop le!");
        System.exit(0); 
        }
        return "maSach="+this.maSach+" /tieuDe="+this.tieuDe+" /tacgia="+this.tacGia+" /namXuatBan="+this.namXuatBan+" /soLuong="+this.soLuong+" /giaCoBan"+this.giaCoBan;
    }
    public void hienThiThongTin() {
        //thêm
        if (this.namXuatBan >= 2026) {
        System.out.println("Nam xuat ban khong hop le!");
        System.exit(0); 
        }
        System.out.println("maSach: "+maSach);
        System.out.println("tieuDe: "+tieuDe);
        System.out.println("tacgia: "+tacGia);
        System.out.println("namXuatBan: "+namXuatBan);
        System.out.println("soLuong: "+soLuong);
        System.out.println("giaCoBan"+giaCoBan);
    }
    public abstract double tinhGiaBan(); 
    

}
