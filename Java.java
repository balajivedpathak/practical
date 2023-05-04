package batchapplication;

public class Java {
	private int stdId;
	private String stdName;
	private String email;
	private long MobNo;
	
	//getter and setter method 
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdMail() {
		return email;
	}
	public void setStdMail(String stdMail) {
		this.email = stdMail;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	
	//parameterized constructor
	public Java(int stdId, String stdName, String email, long MobNo) 	
	{
		super();
		this.stdId=stdId;
		this.stdName=stdName;
		this.email=email;
		this.MobNo=MobNo;
	}
	//no longer constructor
	public Java()
	{
		super();
	}
	
}
