package Hotel_Management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KhachHangThueTheoNgay extends KhachHang{
    protected int soNgayThue;
    public float getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public KhachHangThueTheoNgay() {
        super();
    }
    public KhachHangThueTheoNgay(String hoTen, String gioiTinh, String namSinh, String soCMND, String diaChi, String quocTich, String ngayDen, int soNguoiThue, String loaiPhong, int giaPhong, int soPhong, int soNgayThue) {
        super();
        this.soNgayThue = soNgayThue;
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
        System.out.println("So ngay thue la: ");
        soNgayThue = sc.nextInt();
    }
    @Override
    public void giaHanPhong() {
        Scanner sc = new Scanner(System.in);
        int temp ;
        System.out.println("-So ngay ban muon gia han them: ");
        temp = sc.nextInt();
        soNgayThue += temp;
    }
    @Override
    public int thanhTien() {
        int hoaDon = 0;
        if(nhanPhong >= 14 && traPhong <= 12) {
            hoaDon = giaPhong*soNgayThue;
        }
        //Nhận phòng sớm và trả phòng đúng
        else if(nhanPhong >= 5 && nhanPhong <= 9 && traPhong <= 12) {
            hoaDon = giaPhong*soNgayThue + giaPhong*50/100;
        }
        else if(nhanPhong >= 9 && nhanPhong <= 14 && traPhong <= 12) {
            hoaDon = giaPhong *soNgayThue + giaPhong *30/100;
        }
        //Nhận phòng đúng và trả phòng muộn
        else if(traPhong >= 12 && traPhong <= 15 && nhanPhong >= 14) {
            hoaDon = giaPhong *soNgayThue + giaPhong *30/100;
        }
        else if(traPhong >= 15 && traPhong <= 18 && nhanPhong >=14) {
            hoaDon = giaPhong *soNgayThue + giaPhong *50/100;
        }
        //Nhận phòng sớm và trả phòng muộn
        else if(nhanPhong >= 5 && nhanPhong <= 9 && traPhong >=12 && traPhong <= 15) {
            hoaDon = giaPhong *soNgayThue + giaPhong *80/100;
        }
        else if(nhanPhong >= 5 && nhanPhong <= 9 && traPhong >=15 && traPhong <= 18) {
            hoaDon = giaPhong *soNgayThue + giaPhong;
        }
        else if(nhanPhong >= 9 && nhanPhong <= 14 && traPhong >=12 && traPhong <= 15) {
            hoaDon = giaPhong *soNgayThue + giaPhong *60/100;
        }
        else if(nhanPhong >= 9 && nhanPhong <= 14 && traPhong >=15 && traPhong <= 18) {
            hoaDon = giaPhong *soNgayThue + giaPhong *80/100;
        }
        //Trả phòng muộn sau 18h
        else{
            hoaDon = giaPhong *soNgayThue + giaPhong;
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
            pw.print(getTraPhong()+"\t");
            pw.println(getSoNgayThue()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.close();

    }

}
