package star_pattern;

public class starundersc {
	public static void main(String agr[]) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i+j>=4 && j-i<=4)
				{
					if((i+j)%2==0) {
					System.out.print("*");
					}
					else
						System.out.print("-");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}
	

}
