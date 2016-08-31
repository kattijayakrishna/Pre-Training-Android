interface Person
{
	private String name;
	private String address;

	public Person(String name, String address);
	String getName();
	String getAddress();
	void setAddress(String address);
	String toString();
}

class Student implements Person
{
	private String program;
	private int year:
	private double fee;

	public Student(String name, String address, String program, int year, double fee)
	{
		super();
		this.name=name;
		this.address=address;
		this.program=program;
		this.year=year;
		this.fee=fee;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAddress()
	{
		return this.address;
	}

	public String getProgram()
	{
		return this.program;
	}

	public int getYear()
	{
		return this.year;
	}

	public double getFee()
	{
		return this.fee;
	}

	public void setName()
	{
		return this.name;
	}

	public void setAddress()
	{
		return this.address;
	}

	public void setProgram()
	{
		return this.program;
	}

	public void setYear()
	{
		return this.year;
	}

	public void setFee()
	{
		return this.fee;
	}	

	public String toString()
	{
		return this.name + " " + this.address + " " + this.program + " " + this.year + " " + this.fee;
	}
}

class Staff implements Person
{

	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay)
	{
		super();
		this.name=name;
		this.address=address;
		this.school=school;
		this.pay=pay;
	}

	void setSchool(String School)
	{
		this.school=school;
	}

	void setPay(double pay)
	{
		this.pay=pay;
	}

	String getSchool()
	{
		return this.school;
	}

	double getPay()
	{
		return this.pay;
	}

	String toString()
	{
		return this.name + " " + this.address + " " + this.school + " " + this.pay;
	}

}			