
package star_pattern;

public class Pat28{
	public static void main(String agr[]) {
		
		for(int i=0;i<9;i++)
		{
		char ch='A';
			for(int j=0;j<5;j++)
			{
				if(j-i<=0 &&i+j<=8)
				{
					System.out.print(ch++);
				
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
