
package star_pattern;

public class pat96{
	public static void main(String agr[]) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				if(j-i==4 || i+j==4 || i==4)
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
