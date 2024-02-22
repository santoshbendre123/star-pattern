
package star_pattern;

public class Pat115{
	public static void main(String agr[]) {
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				if(j==0 || (i==0 && j<=3 )|| (i==3 && j<=3)||(i==6 && j<=3)||(j==4)&&(i>0&&i<3)||(j==4)&&(i>=4&&i<=5))
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
