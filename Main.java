// Cập nhật bởi Nguyễn Phúc - 29/10/2025
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt(); sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sách: "); String ma1 = sc.nextLine();
                    System.out.print("Tiêu đề: "); String td1 = sc.nextLine();
                    System.out.print("Tác giả: "); String tg1 = sc.nextLine();
                    System.out.print("Số lượng: "); int sl1 = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gcb1 = sc.nextDouble(); sc.nextLine();
                    System.out.print("Môn học: "); String mh = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, sl1, gcb1, mh));
                    break;

                case 2:
                    System.out.print("Nhập mã sách: "); String ma2 = sc.nextLine();
                    System.out.print("Tiêu đề: "); String td2 = sc.nextLine();
                    System.out.print("Tác giả: "); String tg2 = sc.nextLine();
                    System.out.print("Số lượng: "); int sl2 = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gcb2 = sc.nextDouble(); sc.nextLine();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();
                    quanLy.themSach(new SachTieuThuyet(ma2, td2, tg2, sl2, gcb2, tl));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTK = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTK);
                    System.out.println(s != null ? s : "Không tìm thấy!");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maX = sc.nextLine();
                    quanLy.xoaSach(maX);
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (chon != 0);
    }
}