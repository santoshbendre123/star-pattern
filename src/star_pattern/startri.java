package star_pattern;

public class startri{
	public static void main(String agr[]) {
		
		for(int i=2;i<9;i=i+2)
		{
			for(int j=0;j<9;j++)
			{
				
				if(j-i<=0)
				{
					if(j*2==i)
					System.out.print(" ");
					else
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
