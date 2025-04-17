package Hotel_Management;

import java.util.Scanner;

public class QuanLyThuePhongKhachSan{

    public static void main(String[] args) throws Exception {

        KhachHang kh = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon thue phong nhu nao?\n");
        System.out.println("1. Thue phong theo gio ");
        System.out.println("2. Thue phong qua dem ");
        System.out.println("3. Thue phong theo ngay \n");

        System.out.println("Moi ban chon chuc nang: ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1: {
                kh = new KhachHangThueTheoGio();
                break;
            }
            case 2:{
                kh = new KhachHangThueQuaDem();
                break;
            }
            case 3:{
                kh = new KhachHangThueTheoNgay();
                break;
            }
            default:
                System.out.println("Moi ban chon lai!");
                chon = sc.nextInt();
        }
        int chonTiep;
        do {
            System.out.println("\n1. Dat phong");
            System.out.println("2. Doi phong");
            System.out.println("3. Gia han them");
            System.out.println("4. Tinh tien");
            System.out.println("5. Ghi File");
            System.out.println("Moi ban chon chuc nang: ");
            chonTiep = sc.nextInt();

            switch (chonTiep) {
                case 0: {
                    System.out.println("Thoat!");
                    break;
                }
                case 1: {
                    while(true) {
                        try {
                            kh.datPhong();
                            if(kh.getNhanPhong() < 1 || kh.getNhanPhong() > 24 || kh.getTraPhong() < 1 || kh.getTraPhong() > 24){
                                throw new NumberFormatException();
                            }
                            break;
                        }catch(NumberFormatException e) {
                            System.out.println("Ban phai nhap dung gio trong ngay!");
                        }
                    }
                    System.out.println("Ban da dat phong!");
                    break;
                }
                case 2: {
                    System.out.println("Ban da chon doi phong!");
                    System.out.println("Loai phong can doi la: ");
                    kh.loaiPhong = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Don gia la: ");
                    kh.giaPhong = sc.nextInt();
                    sc.nextLine();
                    System.out.println("So phong doi la: ");
                    kh.soPhong = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ban da doi phong thanh cong!");
                    break;
                }
                case 3: {
                    kh.giaHanPhong();
                    System.out.println("Ban da gia han phong thanh cong!");
                    break;
                }
                case 4: {
                    System.out.println("So tien ban phai tra phong la: " + kh.thanhTien());
                    break;
                }
                case 5: {
                    kh.ghiDanhSach();
                    System.out.println("Ban da ghi file thanh cong!");
                    break;
                }
                default:
                    System.out.println("Moi ban chon lai!");
                    chonTiep = sc.nextInt();
            }
        }while(chonTiep != 0);


    }
}
