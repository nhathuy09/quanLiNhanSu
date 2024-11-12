package thucHanh4_QuanLiNhanSu;



public class NhanVien extends ConNguoi{
	private static final long serialVersionUID =2L;
	private  String congViecChinh;
	public NhanVien(String hoTen, int namSinh, String gioiTinh, String soDienThoai, String congViecChinh) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.congViecChinh = congViecChinh;
	}
	public String getCongViecChinh() {
		return congViecChinh;
	}
	public void setCongViecChinh(String congViecChinh) {
		congViecChinh = congViecChinh;
	}
	
	public String toString() {
		 return "nhân viên : "+super.toString()+","+" công việc chính: "+congViecChinh;
	}
	
	
}
