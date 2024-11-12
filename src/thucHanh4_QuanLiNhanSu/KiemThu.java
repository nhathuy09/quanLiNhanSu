package thucHanh4_QuanLiNhanSu;

import java.util.Scanner;

public class KiemThu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		XuLy xuLy=new XuLy("danhSachNhanSu.dat");
		do {
			System.out.println("\n  CÔNG TY LIÊN DOANH ABC");
			System.out.println(" chon 1- thêm mới nhân sự ");
			System.out.println(" chon 2- Liệt kê thông tin nhân sự ");
			System.out.println(" chọn 3- Tìm kiếm theo họ tên ");
			System.out.println(" chọn 4- TÌm kiếm theo số điện thoại ");
			System.out.println(" chọn 5- Xóa Nhân Sự theo số điện thoại ");
			System.out.println(" chon 6- liêt kê nhân sự theo giới tính ");
			System.out.println("chon 7- liệt kê nhân sự theo năm sinh ");
			System.out.println(" chon 8- Thoát khỏi chương trình ");
			System.out.println("Bạn chọn mục số: ");
			String chon= scanner.nextLine();
			switch (chon.trim()) {
			case "1":{
				System.out.println(" thêm mới nhân sự ");
				System.out.println("1. thêm mới kỹ sư ");
				System.out.println("2. thêm mới công nhân ");
				System.out.println("3. thêm mới nhân viên ");
				System.out.println("4. thêm mới chuyên gia nước ngoài ");
				System.out.println("5. thêm mới lãnh đạo ");
				System.out.println("Bạn chọn mục số: ");
				String themMoi=scanner.nextLine();
				switch(themMoi) {
				
				// thực hiện chức năng thêm nhân sự 
				case "1":{
					System.out.println(" thêm mới kỹ sư");
					System.out.println(" nhập tên ");
					String ten =scanner.nextLine();
					System.out.println("nhập năm sinh ");
					int namSinh=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhập giới tính: ");
					String gioiTinh= scanner.nextLine();
					System.out.println("Nhập số điện thoại: ");
					String soDienThoai= scanner.nextLine();
					System.out.println("Chuyên ngành: ");
					String chuyenNganh=scanner.nextLine();
					ConNguoi kySu=new KySu(ten,namSinh,gioiTinh , soDienThoai,chuyenNganh);
					
					System.out.println(kySu.toString());
					if(xuLy.themMoiNhanSu(kySu))
						System.out.println("thêm mới thành công đã lưu vào tập tin");
					else
						System.out.println("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại");
					break;
					
					
				} 
				case "2":{
					System.out.println("Thêm mới công Nhân");
					System.out.println(" nhập tên ");
					String ten =scanner.nextLine();
					System.out.println("nhập năm sinh ");
					int namSinh=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhập giới tính: ");
					String gioiTinh= scanner.nextLine();
					System.out.println("Nhập số điện thoại: ");
					String soDienThoai= scanner.nextLine();
					System.out.println(" Bậc nghề: ");
					int bac=scanner.nextInt();
					ConNguoi congNhan =new CongNhan(ten,namSinh,gioiTinh,soDienThoai,bac);
			
					System.out.println(congNhan.toString());
					if(xuLy.themMoiNhanSu(congNhan))
						System.out.println("thêm mới nhân sự thành công và đã lưu vào tập tin");
					else
						System.out.println("không thể thêm mới.Mã lỗi[03]. Hãy khởi động và chạy lại phần mềm, nếu lỗi vẫn còn xảy ra hãy liên hệ");
					break;
					
					
					
				}
				case "3":{
					System.out.println("Thêm mới Nhân viên ");
					System.out.println(" nhập tên ");
					String ten =scanner.nextLine();
					System.out.println("nhập năm sinh ");
					int namSinh=scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhập giới tính: ");
					String gioiTinh= scanner.nextLine();
					System.out.println("Nhập số điện thoại: ");
					String soDienThoai= scanner.nextLine();
					System.out.println("Công việc: ");
					String congViec=scanner.nextLine();
					ConNguoi nhanVien=new NhanVien(ten,namSinh,gioiTinh,soDienThoai,congViec);
					
					System.out.println(nhanVien.toString());
					if(xuLy.themMoiNhanSu(nhanVien))
						System.out.println("Thêm mới thành công và đã lưu vào tập tin");
					else
						System.out.println("không thể thêm mới nhân sự mới.Mã lỗi [04]. Hãy khởi động và chạy lại phần mềm , nếu lỗi vẫn còn xảy ra hãy liên hệ...");
					break;
				}
				default:
					System.out.println("bạn chọn sai:");
					break;
				
			}
			}
				// case 2 liệt kê 
			case"2":{
				System.out.println(" Liệt kê thông tin nhân sự");
				xuLy.lietKeThongTinNhanSu();
				break;
				
				
			}
			//case 3 tìm kiếm 
			case"3":{
				System.out.println("Tìm theo họ tên ");
				System.out.println("Nhập vào họ và tên cần tìm: ");
				String hoten=scanner.nextLine();
				hoten=hoten.trim();
				xuLy.lietkeThongTinNhanSu(xuLy.timKiemTheoHoTen(hoten));
				break;
			}
			//case 4 tìm kiếm theo số điện thoại 
			case "4":{
			System.out.println("Tìm kiếm theo số điện thoại");
			System.out.println("Nhập số điện thoại: ");
			String soDienThoai=scanner .nextLine();
			soDienThoai=soDienThoai.trim();
			xuLy.lietkeThongTinNhanSu(xuLy.timKiemTheoSDT(soDienThoai));
			break;
			
			}
			case"5": {
				System.out.println("Xóa nhân sự theo số điện thoại: ");
				System.out.println("Nhập số điện thoại ");
				String soDienThoai=scanner.nextLine();
				soDienThoai=soDienThoai.trim();
				if (xuLy.xoaHoSoNhanSu(soDienThoai)) 
						System.out.println("đã xóa thành công nhân sự");
				else
					System.out.println("Xóa nhân sự không thành công "+"do không tồn tại số điện thoại hoặc bị lỗi");
				
				
					
				break;
				
					
			}
			
			case"6":{
				System.out.println("liệt kê nhân sự theo giới tính ");
				System.out.println("nhập giới tính: ");
				String gioiTinh=scanner.nextLine();
				gioiTinh=gioiTinh.trim();
				xuLy.lietkeThongTinNhanSu(xuLy.lietKeNhanSuTheoGioiTinh(gioiTinh));
				break;
			}
			
			case"7":{
				System.out.println("liệt kê nhân sự theo năm sinh ");
		
			}
			case"8":{
				System.out.println("Đã thoát khỏi chưởng trình.");
				scanner.close();
				return;
			}
			default:
				System.out.println("Bạn chọn sai. chỉ được chọn các con số như menu.Mời chọn lại...");
				continue;
		}
			
	

}while (true);
}
}


	