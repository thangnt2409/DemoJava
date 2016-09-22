package Adapter;

public class NhanVienHocViec extends NhanVien {

	public NhanVienHocViec(String Hoten, String Luong) {
		super(Hoten, Luong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		 System.out.println("Ông "+Hoten+ " là nhân viên học việc có lương là "+Luong);
	}

}
