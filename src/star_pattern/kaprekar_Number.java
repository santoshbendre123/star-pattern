package star_pattern;

public class kaprekar_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		int temp=num,cnt=0;
		int sq=num*num;
		while(temp>0) {
			cnt++;
			temp/=10;
		}
		int div=(int)Math.pow(10, cnt);
		int fpart=sq/div;
		int spart=sq%div;
		if((fpart+spart)==num) {
			System.out.println("kaprekar number");
			
		}
		else
		{System.out.println("not kaprekar number");
		}

	}

}
