package thucHanh4_QuanLiNhanSu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class XuLy {
	private ArrayList<ConNguoi> danhSachConNguoi;
	private String tenTapTin;
	//khởi dựng
	public XuLy(String tenTapTin) {
		
		this.tenTapTin = tenTapTin;
		DocTapTin doc=new DocTapTin(tenTapTin);
		danhSachConNguoi=doc.docDsConNguoi();
		if(danhSachConNguoi==null) {
			danhSachConNguoi=new ArrayList<ConNguoi>();
		}
	}
	//triển khai phương thức
	//thêm nhân sự mới
	public boolean themMoiNhanSu(ConNguoi cn) {
		danhSachConNguoi.add(cn);
		GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
		return ghi.ghiDsConNguoi();
	}
	//liệt kê thông tin nhân sự toàn công ty
	  public void lietKeThongTinNhanSu() {
	    	//sử dùng điều kiện 
	    	// khi số lượng của danhSachNhanSu = 0 thực hiện lệnh IF
	    	if(danhSachConNguoi.size()==0)
	    		System.out.println(" không có nhân viên nào ");
	    	else
	    		//dùng vòng lặp chạy hết các phần tử có trong mảng danhSachNhanSu
	    		for(ConNguoi cn:danhSachConNguoi)
	    			System.out.println(cn.toString());
	    	
	    }
	    
	    
	 //liệt kê thông tin nhan sự theo danh sách
	    
	 public void lietkeThongTinNhanSu(ArrayList<ConNguoi> danhSach) {
		 if(danhSach.size()==0) {
			 System.out.println("không có nhân viên nào ");
			 
		 }
		 else
			 for(ConNguoi cn:danhSach)
				 System.out.println(cn.toString());
	 }
	 
	 
	 //tìm kiếm thông tin nhân sự theo tên
	 public ArrayList<ConNguoi> timKiemTheoHoTen(String ten){
		 //khởi tạo danh sách mới để lưu các giá trị tìm được
		 ArrayList<ConNguoi> ketQua=new ArrayList<>();
		 for(ConNguoi cn: danhSachConNguoi)
			 if(cn.getHoTen().contains(ten))
				 ketQua.add(cn);
		 return ketQua;
	 }
	 
	 //TÌM KIẾM THÔNG TIN NHÂN SỰ THEO SỐ ĐIỆN THOẠI KẾT QUẢ TRẢ VỀ LÀ ARRAYLIST CHỨA NHÂN SỰ
	 public ArrayList<ConNguoi>timKiemTheoSDT(String soDienThoai){
		 ArrayList<ConNguoi> ketQua=new ArrayList<>();
		 for(ConNguoi cn:danhSachConNguoi)
			 if(cn.getSoDienThoai().equals(soDienThoai))
				 ketQua.add(cn);
		 return ketQua;
	 }
	
	//xóa hồ sơ nhân sự
	 public boolean xoaHoSoNhanSu(String soDienThoai) {
		 boolean ketQuaXoa= false;
		 for(ConNguoi cn:danhSachConNguoi)
			 if(cn.getSoDienThoai().equals(soDienThoai)) {
				 danhSachConNguoi.remove(cn);
				 GhiVaoTapTin ghi=new GhiVaoTapTin(tenTapTin, danhSachConNguoi);
				 ketQuaXoa=ghi.ghiDsConNguoi();
				 break;
			 }
		 return ketQuaXoa;
		 
		 
	 }
	 // liệt kê nhân sư theo giới tính 
	 
	 
	 public ArrayList<ConNguoi> lietKeNhanSuTheoGioiTinh(String gioiTinh) {
		 ArrayList<ConNguoi>nhanSu=new ArrayList<>();
		 
		 if(danhSachConNguoi.size()==0) 
			 System.out.println("không có nhân viên nào ");
		 else
			 for(ConNguoi cn: danhSachConNguoi)
				 if(cn.getGioiTinh().equalsIgnoreCase(gioiTinh))
					 nhanSu.add(cn);
		 return nhanSu;
				 
				 
		 
	 }

	 //liệt kê theo năm sinh , 1: tăng dân,0:giảm dần
	 
	 public void lietKeNhanSuTheoNamSinh(byte tangDanTheoNamSinh) {
		 if(tangDanTheoNamSinh==1) {
			 
		 }
		
			 
			
		 
	 }
}
