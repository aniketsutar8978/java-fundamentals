package A4_Looping_Statement;

public class _3Nested_for_loop {
	
	public static void main(String[] args)
	{
		System.out.println("Example no1 ");     
		for(int a=1; a<=4; a++) 
		{
			for(int k=1; k<=3; k++)
			{
			System.out.print("Ram  ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Example no 2");
		
		for(int i=1; i<=5; i++)
		{
			for( int j=1; j<=5; j++)
			{
				if(i==3)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("Example no 3");
		
		for(int h=1; h<=5; h++)
		{
			for(int g=1; g<=5; g++)
			{
				if(h==3 && g==3)
				{
					System.out.print("$ ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		
	System.out.println("Example no 4");	
	
		for(int m=1; m<=5; m++)
		{
			for(int f=1; f<=5; f++)
			{
				if(m==3)
				{
					System.out.print("& ");
				}
				else if (f==3)
				{
					System.out.print("& ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	
	System.out.println("Example no 5");
          
		for(int t=1; t<=5; t++)
		{
			for (int s=1; s<=5; s++)
			{
				if (t==1 && s==5)
				{
					System.out.print("&  ");
				}
				else if (t==5 && s==5)
				{
					System.out.print("$  ");
				}
				else
				{
					System.out.print("*  ");
				}
			}
			System.out.println();	
	   }
		
	System.out.println("Enter the table of 2 to 5");	
	
	  for(int tbl=1; tbl<=10; tbl++)
	  {
		  for( int main=2; main<=5; main++)
		  {
			  System.out.print(main*tbl +" \t "  );
		  }
		  System.out.println();
		
	  }
		
	  
	
	  
	 
		
	}

}
