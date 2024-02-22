
package star_pattern;

public class Pat27{
	public static void main(String agr[]) {
		char ch='A';
		for(int i=0;i<9;i++)
		{
		
			for(int j=0;j<5;j++)
			{
				if(j-i<=0 &&i+j<=8)
				{
					System.out.print(ch);
				
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i<4)
              ch++;
			else
				ch--;
		

		}
		
	}
	

}
