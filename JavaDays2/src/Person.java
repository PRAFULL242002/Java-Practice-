import java.util.Date;
import java.text.SimpleDateFormat;

public class Person 
{
	private int pid;
	private String pname;
	private String pmobile;
	private Date bdate;
	public Person()
	{
		this(0,null,null,null);
	}
	
	public Person(int id, String name, String mobile, Date date)
	{
		pid = id;
		pname = name;
		pmobile = mobile;
		bdate = date;
	}
	
	public void setPname(String name)
	{
		this.pname = name;
	}
	
	public void setPmobile(String mobile)
	{
		this.pmobile = mobile;
	}
	
	public void setDate(Date date)
	{
		this.bdate = date;
	}
	
	public int getPid()
	{
		return pid;
	}
	
	public String getPname()
	{
		return pname;
	}
	
	public String getPmobile()
	{
		return pmobile;
	}
	
	public Date getBdate()
	{
		return bdate;
	}
	
	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dt = sdf.format(bdate);
		return "Id: "+this.pid+"\nName: "+this.pname+"\nMobile No.: "+this.pmobile+"\nBirth Date: "+dt;
	}
}
