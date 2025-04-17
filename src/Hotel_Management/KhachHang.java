package Hotel_Management;

public abstract class KhachHang {
    protected String hoTen;
    protected String namSinh;
    protected String gioiTinh;
    protected String diaChi;
    protected String soCMND;
    protected String quocTich;
    protected String ngayDen;
    protected String soPhong;
    protected String loaiPhong;
    protected int soNguoiThue;
    protected int giaPhong;
    protected float nhanPhong;
    protected float traPhong;

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getQuocTich() {
        return quocTich;
    }
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public String getNgayDen() {
        return ngayDen;
    }
    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }
    public String getLoaiPhong() {
        return loaiPhong;
    }
    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    public int getGiaPhong() {
        return giaPhong;
    }
    public void setGiaPhong(int donGia) {
        this.giaPhong = giaPhong;
    }
    public int getSoNguoiThue() {
        return soNguoiThue;
    }
    public void setSoNguoiThue(int soNguoiThue) {
        this.soNguoiThue = soNguoiThue;
    }
    public String getSoPhong() {
        return soPhong;
    }
    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }
    public float getNhanPhong() {
        return nhanPhong;
    }
    public void setNhanPhong(float nhanPhong){
        this.nhanPhong = nhanPhong;
    }
    public float getTraPhong() {
        return traPhong;
    }
    public void setTraPhong(float traPhong){
        this.traPhong = traPhong;
    }
    public KhachHang() {
        super();
    }
    public KhachHang(String hoTen, String gioiTinh, String namSinh, String soCMND, String diaChi, String quocTich,
                     String ngayDen, int soNguoiThue, String loaiPhong, int giaPhong, String soPhong, float nhanPhong, float traPhong) {
        super();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.soCMND = soCMND;
        this.diaChi = diaChi;
        this.quocTich = quocTich;
        this.ngayDen = ngayDen;
        this.soNguoiThue = soNguoiThue;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.soPhong = soPhong;
        this.nhanPhong = nhanPhong;
        this.traPhong = traPhong;
    }

    public abstract void datPhong();
    public abstract void giaHanPhong();
    public abstract int thanhTien();
    public abstract void ghiDanhSach();

}

