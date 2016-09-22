package Adapter;

public class NhanVienChinhThuc extends NhanVien {

	public NhanVienChinhThuc(String Hoten, String Luong) {
		super(Hoten, Luong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		System.out.println("Ông "+Hoten+ " là nhân viên chính thức có lương là "+Luong);
	}

}
