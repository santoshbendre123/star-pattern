
package star_pattern;

public class Pat114{
	public static void main(String agr[]) {
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				if((i==0 &&(j>=1 &&j<=3))||(j==0 &&i>=1)||(j==4 && i>=1)||(i==3))
				{
					System.out.print("*");		
					
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
	
			System.out.println();

		}
		
	}
	

}
