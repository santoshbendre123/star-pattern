package star_pattern;

public class xyz {
	public static void main(String agr[]) {
		int cnt1=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				if(j-i<=0)
				{
					System.out.print(cnt1+" ");
					cnt1++;
				
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
