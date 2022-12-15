package interviewQuestions;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) 
	{
		
		//Queue[] names={"parthiban", "sarathi"};
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Parthiban");
		queue.add("Sarathi");
		queue.add("Parthiban");
		
		String removedElement=queue.remove();
		System.out.println("Removed element is: "+removedElement);
		
		Iterator<String> itr = queue.iterator();
		
		
		int i=0;
		while(itr.hasNext())
		{
			String value=itr.next();
			if(value.equals(removedElement))
			{
				itr.remove();
			   
			}
			
			else 
			{
				System.out.println( i +" name is " + value);
				i++;
			}
		}
				
	}

}
