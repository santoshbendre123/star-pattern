package star_pattern;

public class harshad_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=172;
		int temp=num,sum=0;
		while(temp>0) {
			int last=temp%10;
			sum=sum+last;
			temp/=10;
		}
		if(num%sum==0) {
			System.out.println("harshad number");
			
		}
		else
		{System.out.println("not harshad number");
		}

	}

}
