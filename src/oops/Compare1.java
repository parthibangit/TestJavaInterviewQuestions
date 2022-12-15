package oops;

public class Compare1 implements Comparable<Compare1>
{

	String materialName;
	String Weight;
	String Unit;
	
	public Compare1(String materialName, String Weight, String Unit)
	{
		
		this.materialName=materialName;
		this.Weight=Weight;
		this.Unit=Unit;
		
	}
	
	

	@Override
	public int compareTo(Compare1 stu) 
	{
	
//		if(Weight==stu.Weight)
//			return 0;
//		else if(materialName!=materialName)
//			return 0;
//		else
//			return -1;
		
		return 0;
					
	}
}
