
package star_pattern;

public class Pat77{
	public static void main(String agr[]) {
		int cnt=1;
		for(int i=0;i<5;i++)
		{
			int diff=4;
			int cnt2=cnt;
			for(int j=0;j<10;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2+" ");
				}
				else
				{
					System.out.print(" ");
				}
				cnt2=cnt2+diff;
				diff--;
				
			}
	cnt++;
			System.out.println();

		}
		
	}
	

}
