
public class prime {
	
	public static void sumOfFirstAndLast(int num) {
		int count = 0;
		int copy = num;
		int sum = 0;
		while (num > 0)
		{
			count++;
			num = num / 10;
		}
		if (count > 1)
		{
			num = copy;

			int lastNum = num % 10;
			int div = 1;

			while (num > 10) 
			{
				div = div * 10;
				num = num / 10;
			}
			int firstNum = copy / div;
			sum = firstNum + lastNum;
			System.out.println(sum);
		} 
		else 
		{
			sum = copy;
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
