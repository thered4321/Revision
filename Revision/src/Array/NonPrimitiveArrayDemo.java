package Array;

public class NonPrimitiveArrayDemo {
	
	String name;
	int yop;
	double percentage;
	
	NonPrimitiveArrayDemo(String name,int yop, double percentage)
	{
		this.name= name;
		this.yop= yop;
		this.percentage= percentage;
	}
	
	public String details()
	{
		return(name + " " +yop + " " +percentage);
	}

}
