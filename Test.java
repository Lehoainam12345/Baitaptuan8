package Baitaptuan6;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        QuanLySach sach1= new QuanLySach();
        sach1.Nhap();
        sach1.Xuat();
        sach1.capnhat();
        sach1.Xuat();
        System.out.println("KIEM TRA IKIEM KE");
        IkiemKe sach2 = new SachGiaoTrinh(
            "SGT001",                 
            "Lap trinh java co ban",  
            "Pham Nhat Khoa",          
            2000,                   
            99,                      
            150000,                 
            "Dai hoc",               
            "Cong nghe thong tin",    
            "Kho A77 - Ke 57"          
        );
        boolean duTonKho = sach2.kiemTraTonKho(100);
        System.out.println("Con du so luong yeu cau? " + duTonKho);
        sach2.capNhatViTri("Kho A1-Ke 5");

    }
}
//sach2.hienThiThongTin();
//sach1.Them();
//sach1.Xuat();
//System.out.println("Nhap ma sach can xoa: ");
//sach1.Xoa();
//sach1.Xuat();
//sach1.capnhat();
//sach1.Xuat();
