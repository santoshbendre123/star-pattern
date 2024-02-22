package star_pattern;

public class isosceles
{
	public static void main(String arg[])
	{
				int i,j,f;
				for ( i=1;i<11; i++)
				{	
						for(int k=i;k<11;k++)
						{
				System.out.print(" ");
						}
						f=i+i-1;
						if(f==1)
						{
								System.out.print("*");
						}
						else
						for(j=1;j<=f;j++ )
						{
						System.out.print("*");
						}
						
						System.out.println("");
						
				}
	}

		
}

