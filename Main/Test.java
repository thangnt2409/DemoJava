package Main;

import Interface.NhanVien;
import Interface.NhanVienA;
import Interface.NhanVienB;
import Override.ClassA;
import Override.ClassA1;
import Override.ClassA2;

public class Test {

	public static void main(String[] args) {
		NhanVien nv=new NhanVienA();
		nv.Luong();
		nv=new NhanVienB();
		nv.Luong();
		
		ClassA c=new ClassA1();
		c.ThongTin();
		c=new ClassA2();
		c.ThongTin();
	}

}
