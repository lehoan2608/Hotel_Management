package Hotel_Management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KhachHangThueQuaDem extends KhachHang{
    public KhachHangThueQuaDem() {
        super();
    }
    public KhachHangThueQuaDem(String hoTen, String gioiTinh, String namSinh, String soCMND, String diaChi, String quocTich, String ngayDen, int soNguoiThue, String loaiPhong, int giaPhong, String soPhong, float nhanPhong, float traPhong) {
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
        System.out.println("Don gia la: ");
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
        // TODO Auto-generated method stub
    }
    @Override
    public int thanhTien() {
        int hoaDon = giaPhong;
        if(nhanPhong >= 20|| traPhong <=8) {
            hoaDon = giaPhong;
        }
        float soGioDu = 0;
        if(nhanPhong < 20 || traPhong > 8) {
            soGioDu = (20 - nhanPhong) + (traPhong - 8);
            float soPhut = soGioDu - (int)soGioDu;
            if(soPhut <= 0.3) {
                soGioDu = (int)soGioDu;
            }else {
                soGioDu = (int)soGioDu + 1;
            }

            hoaDon += (int)soGioDu*20000;
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
