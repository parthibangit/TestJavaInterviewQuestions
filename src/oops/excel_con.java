package oops;

public class excel_con 
{

	public String material_name;
	public int weight;
	public String unit;
		

	public String  getMaterial()
	{
		return material_name;
	}
	
	public String setMaterial(String material_name)
	{
		
		this.material_name=material_name;
		return  material_name;
	}
	
	public int getWeight()
	{
		return weight;		
	}
	
	public int setWeight(int weight)
	{
		
		this.weight=weight;
		return weight;
	}

	
	public String getUnit()
	{
		
		return unit;	
	}

	public String setUnit(String unit)
	{
		
		this.unit=unit;
		return unit;
	}

}
