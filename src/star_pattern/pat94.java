
package star_pattern;

public class pat94{
	public static void main(String agr[]) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				if(j==0 || i+j==4 || i==0)
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
