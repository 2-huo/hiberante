package hibernate01;

import java.util.Date;

public class Students {
	//1.公有的类，属性私有提供不带参数的的默认构造方法提供geter和setter
	private int sid;
	private String sname;
	private String gender;
	private Date birthday;
	private String address;
	public Students() {
		
	}
	public Students(int sid, String sname, String gender, Date birthday, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	
	
}
