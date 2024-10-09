
public class Student {
	static int min_passing_marks;
	static String degree;
	private static int cnt=1;
	static {
		min_passing_marks = 35;
		degree = "DAC";
	}
	private String sid;
	private String sname;
	private String saddress;
	private int m1,m2,m3;
	
	private static String generatecode(String name, String address)
	{
		String code = "";
		if(name != null && address != null)
		{
			code = name.substring(0,2)+address.substring(0,2)+cnt;
		}
		else
		{
			code = "xx"+"yy"+cnt;
		}
		cnt++;
		return code;
	}
	public Student() {
		sid = generatecode(null,null);
		sname = null;
		saddress = null;
		m1 = 0;
		m2 = 0;
		m3 = 0;
	
	}
	public Student(String sname, String saddress, int m1, int m2, int m3) 
	{
		this.sid = generatecode(sname,saddress);
		this.sname = sname;
		this.saddress = saddress;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public String getSid() {
		return sid;
	}
//	public void setSid(String sid) {
//		this.sid = sid;
//	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ",sname=" + sname + ", saddress=" + saddress + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + "]";
	}
	
	
}
