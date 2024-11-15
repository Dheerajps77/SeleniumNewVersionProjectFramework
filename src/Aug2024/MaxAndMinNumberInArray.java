package Aug2024;

public class MaxAndMinNumberInArray {
	
	
	public static void maxAndMinNumber()
	{
		try {
			
			int n[]= {34,546,332,45,644,3,456,5453,423,7653,3432,3,5,6,744,5,6434,456,7,4334};
			
			int max=n[0];
			int min=n[0];
			
			for(int i=0;i<n.length;i++)
			{
				if(n[i]>max)
				{
					max=n[i];
				}
				else if(n[i]<min)
				{
					min=n[i];
				}
			}
			
			System.out.println("Max number : " + max);
			System.out.println("Min number : " + min);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		maxAndMinNumber();
	}

}
