package star_pattern;

public class pellnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,sum=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<10;i++)
		{
		sum=num2*2+num1;
		System.out.println(sum);
		num1=num2;
		num2=sum;
	
		}

	}

}
