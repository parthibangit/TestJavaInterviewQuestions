package interviewQuestions;

import java.util.Arrays;


public class RotateImage 
{

	public static void main(String[] args)
	{
	  
	  int[][] a = {{1,2,3},
			      {4,5,6},
			      {7,8,9}};
	  
	  System.out.println(Arrays.deepToString(rotateImage(a)));
	  //int[][] b=rotateImage(a);
	 	  
	}


	static int[][] rotateImage(int[][] a) 
	{

	  int size =  a.length-1;
	  
	  int[][] output=new int[a.length][a.length];
	  
	  for(int i=0; i<a.length; i++)
	  {
	    
	    for(int j=0; j<a.length; j++)
	    {
	      
	       output[j][size-i] = a[i][j];
	      
	    }
	    
	  }
	  
	  return output; 
	}
}
