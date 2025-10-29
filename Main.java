import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giao Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 0) break;

            switch (ch) {
                case 1 -> {
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Mã: ");
                    String ma = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double g = sc.nextDouble();
                    System.out.print("Số lượng tồn: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vt = sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();

                    quanLy.themSach(new SachGiaoTrinh(td, ma, g, sl, vt, mh));
                }
                case 2 -> {
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Mã: ");
                    String ma = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double g = sc.nextDouble();
                    System.out.print("Số lượng tồn: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vt = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();

                    quanLy.themSach(new SachTieuThuyet(td, ma, g, sl, vt, tl));
                }
                case 3 -> quanLy.hienThiDanhSach();

                case 4 -> {
                    System.out.print("Nhập mã sách: ");
                    String ms = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ms);
                    System.out.println((s == null) ? "Không tìm thấy!" : s);
                }

                case 5 -> {
                    System.out.print("Nhập mã sách để xóa: ");
                    String ms = sc.nextLine();
                    quanLy.xoaSach(ms);
                    System.out.println("Đã xóa nếu tồn tại.");
                }

                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}
