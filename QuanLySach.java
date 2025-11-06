package Baitaptuan6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLySach implements IQuanLySach{
    private ArrayList<Sach> ListSach = new ArrayList<>();
    private int N;
    private Scanner sc;
    public QuanLySach(){
        sc =new Scanner (System.in);
    }
    public void Nhap(){
        char chon;
        char c='y';
        Sach listsach=null;
        while(c=='y')
        {
            System.out.println("Loai can nhap (T=Sachtieuthuyet/G=Sachgiaotrinh)");
            chon =sc.nextLine().toUpperCase().charAt(0);
            switch(chon){
                case 'T':
                    listsach = new SachTieuThuyet();
                    listsach.Nhap();
                    break;
                case 'G':
                    listsach =new SachGiaoTrinh();
                    listsach.Nhap();
                    break; 
                default: 
                    System.out.println("Lựa chọn không hợp lệ!");      
                    break;
            }
            if(listsach!=null)
                ListSach.add(listsach);
            System.out.println("nhap ky tu 'y' de tiep tuc và ky tu bat ky de ket thuc chuong trinh nhap");
            c=sc.nextLine().toLowerCase().charAt(0);
        }
    }
     public void Xuat(){
        for(Sach s : ListSach){
            System.out.println("----------------");
            System.out.println(s);
        }
    }
    public void Them(){ 
        Sach listsach=null;
        int n;
        char chon;
        N=ListSach.size();
        System.out.println("Can nhap them bao nhieu: ");
        n =Integer.parseInt(sc.nextLine());
        for(int i=N;i<N+n;i++){
        System.out.println("Loai can nhap (T=Sachtieuthuyet/G=Sachgiaotrinh)");
            chon =sc.nextLine().toUpperCase().charAt(0);
            switch(chon){
                case 'T':
                    listsach = new SachTieuThuyet();
                    listsach.Nhap();
                    break;
                case 'G':
                    listsach =new SachGiaoTrinh();
                    listsach.Nhap();
                    break; 
                default: 
                    System.out.println("Lựa chọn không hợp lệ!");      
                    break;
            }
            if(listsach!=null){
                ListSach.add(listsach);
            }
        }
    }
    public void Xoa(){
        String ma;
        System.out.println("Nhap ma sach can xoa: ");
        ma=sc.nextLine();
        ListSach.remove(tim(ma));
     }  
     public void Xoa(String ma){
        ListSach.remove(tim(ma));
     }  
     public Sach tim (){
        String ma;
        System.out.println("Nhap ma sach can xoa: ");
        ma=sc.nextLine();
        HashMap<String,Sach> s = new HashMap<>();
        for(Sach a : ListSach){
            s.put(a.maSach,a);
        }
        return s.get(ma);
     }
     public Sach tim (String ma){
        HashMap<String,Sach> s = new HashMap<>();
        for(Sach a : ListSach){
            s.put(a.maSach,a);
        }
        return s.get(ma);
     }
    public void capnhat (){
        Sach listsach=null;
        String ma;
        System.out.println("Nhap ma sach can cap nhat: ");
        ma=sc.nextLine();
        char chon;
        System.out.println("Loai can nhap (T=Sachtieuthuyet/G=Sachgiaotrinh)");
            chon =sc.nextLine().toUpperCase().charAt(0);
            switch(chon){
                case 'T':
                    listsach = new SachTieuThuyet();
                    listsach.Nhap();
                    break;
                case 'G':
                    listsach =new SachGiaoTrinh();
                    listsach.Nhap();
                    break; 
                default: 
                    System.out.println("Lựa chọn không hợp lệ!");      
                    break;
            }
            if(listsach!=null){
                int i=0;
                for(Sach s: ListSach){
                    if (s.maSach.equals(ma)){
                        ListSach.set(i, listsach);
                    }
                    i++;
                }
            }
    }
    public void capnhat (String ma){
        Sach listsach=null;
        char chon;
        System.out.println("Loai can nhap (T=Sachtieuthuyet/G=Sachgiaotrinh)");
            chon =sc.nextLine().toUpperCase().charAt(0);
            switch(chon){
                case 'T':
                    listsach = new SachTieuThuyet();
                    listsach.Nhap();
                    break;
                case 'G':
                    listsach =new SachGiaoTrinh();
                    listsach.Nhap();
                    break; 
                default: 
                    System.out.println("Lựa chọn không hợp lệ!");      
                    break;
            }
            if(listsach!=null){
                int i=0;
                for(Sach s: ListSach){
                    if (s.maSach.equals(ma)){
                        ListSach.set(i, listsach);
                    }
                    i++;
                }
            }
    }
}

