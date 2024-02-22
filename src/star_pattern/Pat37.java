
package star_pattern;

public class Pat37{
	public static void main(String agr[]) {
		char ch='A';
		for(int i=0;i<6;i++)
		{
			char ch2=ch;
			for(int j=0;j<10;j++)
			{
				if(j-i<=0)
				{
					System.out.print(ch2+" ");
				}
				else
				{
					System.out.print(" ");
				}
	ch2=(char)(ch2+5);
				
			}
ch++;
			System.out.println();

		}
		
	}
	

}
