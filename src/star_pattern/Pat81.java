
package star_pattern;

public class Pat81{
	public static void main(String agr[]) {
		int cnt2=1;
		for(int i=0;i<5;i++)
		{
			int cnt=1;
			int cnt3=cnt2;
			for(int j=0;j<10;j++)
			{
				
				
				if((j+i>=9)||(j-i<=0))
				{
					if(j<=4)
						System.out.print(cnt++);
					else
						System.out.print(cnt3--);
					
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
	cnt2++;
			System.out.println();

		}
		
	}
	

}
