package day0810;

public class LottoArraysTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0; j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}
			}
			
		}
		
		for(int i=0; i<lotto.length;i++)
		{
			for(int j=0;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		System.out.println();

	}
	

}
