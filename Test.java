package Baitaptuan6;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        char c='y';
        Scanner sc =new Scanner (System.in);
        char chon;
        QuanLySach sach1= new QuanLySach();
        sach1.Nhap();
        while(c=='y'){
            System.out.println("YEU CAU:");
            System.out.println("1. Xuat");
            System.out.println("2. Capnhat");
            System.out.println("3. Xoa");
            System.out.println("4. Them");
            System.out.println("Chon=");
            chon =sc.nextLine().toUpperCase().charAt(0);
            switch (chon) {
                case '1':
                    sach1.Xuat();
                    break;
                case '2':
                    sach1.capnhat();
                    break;
                case '3':
                    sach1.Xoa();
                    break;
                default:
                    sach1.Them();
                    break;
            
            }
            System.out.println("nhap ky tu 'y' de tiep tuc và ky tu bat ky de ket thuc");
            c=sc.nextLine().toLowerCase().charAt(0);
        }
        System.out.println("KIEM TRA IKIEM KE");
        Sach sach2 = new SachGiaoTrinh(
            "SGT001",                 
            "Lap trinh java co ban",  
            "Pham Nhat Khoa",          
            2024,                   
            99,                      
            150000,                 
            "Dai hoc",               
            "Cong nghe thong tin",    
            "Kho A77 - Ke 57"          
        );
        sach2.hienThiThongTin();
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
