package interviewQuestions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.exec.util.StringUtils;

public class RemoveValueFromList 
{

	
	public static void main(String[] args) 
	{
	
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(3);
		int k=2;
		
		System.out.println(removeKFromList(l, k));	
		
	}
	
	public static List<Integer> removeKFromList(List<Integer> list, int k)
	{
		
		Iterator<Integer> itr=list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer integer = (Integer) itr.next();
			
			if(integer==k)
			{
				itr.remove();
			}
			
		}
		return list;	
	}
}
