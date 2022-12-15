package interviewQuestions;



public class IntegerOccurenceCount {

	public static void main(String[] args) throws Exception 
	{
		
		int[] a={1,2,1,3,4,3,6,3,4};
		int size=a.length;
	    int i,j,c = 0,count;
	    
	    
	    for(i=0;i<size;i++)
	    {
	    	count=1;
	    	
	    	for(j=i+1;j<size;j++)
	    	{
	    		
	    		if(a[i]==a[j])
	    		{
	    			a[j]=c;
	    			count++;
	    		}	
	    	}
	    	
	    	if(a[i]!=c)
		    {
		    	System.out.println(a[i]+" occurence is "+ count);
		    }			
	    }
	    	
	}	
}
