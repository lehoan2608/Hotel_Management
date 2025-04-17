package Hotel_Management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KhachHangThueTheoGio extends KhachHang{
    public KhachHangThueTheoGio() {
        super();
    }
    public KhachHangThueTheoGio(String hoTen, String gioiTinh, String namSinh, String soCMND, String diaChi, String quocTich, String ngayDen, int soNguoiThue, String loaiPhong, int giaPhong, String soPhong, float nhanPhong, float traPhong) {
        super(hoTen, gioiTinh, namSinh, soCMND, diaChi, quocTich, ngayDen, soNguoiThue, loaiPhong, giaPhong, soPhong, nhanPhong, traPhong);
    }

    @Override
    public void datPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMoi ban nhap thong tin de dat phong!");
        System.out.println("Ho va ten la: ");
        hoTen = sc.nextLine();
        System.out.println("Gioi tinh la: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nam sinh la: ");
        namSinh = sc.nextLine();
        System.out.println("So CMND la: ");
        soCMND = sc.nextLine();
        System.out.println("Dia chi la: ");
        diaChi = sc.nextLine();
        System.out.println("Quoc tich la: ");
        quocTich = sc.nextLine();
        System.out.println("Ngay den thue la: ");
        ngayDen = sc.nextLine();
        System.out.println("So nguoi thue la: ");
        soNguoiThue = sc.nextInt();
        sc.nextLine();
        System.out.println("Loai phong la: ");
        loaiPhong = sc.nextLine();
        System.out.println("Don gia gio dau la: ");
        giaPhong = sc.nextInt();
        sc.nextLine();
        System.out.println("So phong la: ");
        soPhong = sc.nextLine();
        System.out.println("Thoi gian nhan phong la: ");
        nhanPhong = sc.nextFloat();
        System.out.println("Thoi gian tra phong la: ");
        traPhong = sc.nextFloat();
    }
    @Override
    public void giaHanPhong() {
    }
    @Override
    public int thanhTien() {
        float soGioThue = traPhong - nhanPhong;
        float soPhut = soGioThue - (int)soGioThue;
        if(soPhut <= 0.3) {
            soGioThue = (int)soGioThue;
        }else {
            soGioThue = (int)soGioThue + 1;
        }

        int hoaDon = giaPhong;
        if(soGioThue == 1) {
            hoaDon = giaPhong;
        }
        if(soGioThue >=2) {
            for (int i = 2; i <= (int)soGioThue; i++) {
                hoaDon += 20000;
            }
        }

        return hoaDon;
    }
    @Override
    public void ghiDanhSach() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("BaiTapLon.txt", true);
            pw = new PrintWriter(new BufferedWriter(fw));

            pw.print(getHoTen()+"\t     ");
            pw.print(getGioiTinh()+"\t");
            pw.print(getNamSinh()+"\t\t");
            pw.print(getSoCMND()+"\t");
            pw.print(getQuocTich()+"\t");
            pw.print(getDiaChi()+"\t");
            pw.print(getNgayDen()+"\t");
            pw.print(getSoNguoiThue()+"\t\t");
            pw.print(getLoaiPhong()+"\t");
            pw.print(getGiaPhong()+"\t");
            pw.print(getSoPhong()+"\t\t");
            pw.print(getNhanPhong()+"\t\t");
            pw.print(getTraPhong()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.close();
    }
}
