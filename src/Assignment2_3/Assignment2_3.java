//package name
package Assignment2_3;

public class Assignment2_3 {//class name
	
	public static void main(String args[]){//main method
		
		for(int i=1;i<=5;i++)//outer for loop for the rows
		{
			for(int j=1;j<=5;j++)//inner for loop for the columns
			{
				//logic to implement x pattern
				if(i==j)//if both row and column values are equal print *
					System.out.print("*");
									
				if((i==1 && j==5)||(i==5 && j==1))
				{
					System.out.print("*");
					
				}
			    if((i==2 && j==4)||(i==4 && j==2))
				{
					System.out.print("*");
				}
			    else{
			    	System.out.print(" ");//print space for other than above conditions
			    }
												
			}//end of inner for loop
			System.out.println();//prints new line after each row
		}//end of outer for loop
	}//end of main
}//end of class
		

