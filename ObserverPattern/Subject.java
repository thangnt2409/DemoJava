
public interface  Subject {
	 public void attachObserver(Observer observer);// thêm đối tượng đăng ký lắng nghe thông báo.
	 
	 
	    public void detachObserver(Observer observer);// hủy đối tượng đăng ký lắng nghe thông báo
	 
	 
	    public void notifyObserver();// thong bao đến tất cả các đối tượng đã đăng ký thông 
}
