package thucHanh4_QuanLiNhanSu;



public class CongNhan extends ConNguoi {
	private static final long serialVersionUID =2L;
	private int bacNghe;

	public CongNhan(String hoTen, int namSinh, String gioiTinh, String soDienThoai, int bacNghe) {
		super(hoTen, namSinh, gioiTinh, soDienThoai);
		this.bacNghe = bacNghe;
	}

	public int getBacNghe() {
		return bacNghe;
	}

	public void setBacNghe(int bacNghe) {
		this.bacNghe = bacNghe;
	}
	public String toString() {
		 return "công nhân: " + super.toString()+","+" bậc nghề: "+bacNghe;
	}

}
