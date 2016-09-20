package Overload;

public class SinhVien {

	String HoTen;
	String MSSV;
	String NgaySinh;
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public SinhVien(String HoTen, String MSSV,String NgaySinh)
	{
		this.HoTen=HoTen;
		this.MSSV=MSSV;
		this.NgaySinh=NgaySinh;
	}
	public SinhVien(SinhVien sv)
	{
		this.HoTen=sv.HoTen;
		this.MSSV=sv.MSSV;
		this.NgaySinh=sv.NgaySinh;
	}
}
