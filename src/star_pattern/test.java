package star_pattern;

public class test {
	public class Test {

	}

	public static void main(String []args) {
		int num1=1;
		for(int i=0;i<5;i++) {
			int num2=num1,a=4;
			for(int j=0;j<5;j++)
			{
				
				if(j-i<=0)
				{
					System.out.print(num2+" ");
					
					
				}
				else
				{
					System.out.print(" ");
				}
				num2+=a;
				a--;
			}
			
		num1++;
		System.out.println();
		}
	}

}
