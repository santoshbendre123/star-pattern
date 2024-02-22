
package star_pattern;

public class pat112{
	public static void main(String agr[]) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				
				if((i+j==1)||(j-i==2)&&(i<2)||(i+j==4)&&(i<2)||(j-i==5)||(j-i==-1)||(j+i==7))
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
