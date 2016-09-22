package Adapter;

public abstract class NhanVien {

	String Hoten ;
	String Luong;
	 public NhanVien(String Hoten ,String Luong) {
		this.Hoten=Hoten;
		this.Luong=Luong;
	}
		
	
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getLuong() {
		return Luong;
	}
	public void setLuong(String luong) {
		Luong = luong;
	}
	public abstract void xuat();
}
