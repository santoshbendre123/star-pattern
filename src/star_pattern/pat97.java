
package star_pattern;

public class pat97{
	public static void main(String agr[]) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				if(j-i==0 || i+j==8 || i==0)
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
