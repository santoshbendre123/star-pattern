
package star_pattern;

public class pat{
	public static void main(String agr[]) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				if((j+i==4 )|| (j+i==8)|| (i==4 && j<=4)|| (i==0 && j>=4))
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
